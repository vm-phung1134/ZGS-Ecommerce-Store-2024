package com.ecommerce.ecommercerestapi.config.jwt;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtUtils {
    public static final String SECRET_KEY = "5367566B59703373367639792F423F4528482B4D6251655468576D5A71347437";
    public static final int ACCESS_TOKEN_VALIDIY = 60 * 60 * 24 * 1000;
    public static final int REFRESH_TOKEN_VALIDIY = 7 * 24 * 60 * 60 * 1000;

    private Key getSignKey() {
        byte[] keyBytes = Decoders.BASE64.decode(SECRET_KEY);
        return Keys.hmacShaKeyFor(keyBytes);
    }

    private Claims extractAllClaims(String token) {
        return Jwts
                .parserBuilder()
                .setSigningKey(getSignKey())
                .build()
                .parseClaimsJws(token)
                .getBody();
    }

    public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
        final Claims claims = extractAllClaims(token);
        return claimsResolver.apply(claims);
    }

    public String extractEmail(String token) {
        return extractClaim(token, Claims::getSubject);
    }

    public Date extractExpiration(String token) {
        return extractClaim(token, Claims::getExpiration);
    }

    private Boolean isTokenExpired(String token) {
        return extractExpiration(token).before(new Date());
    }

    public Boolean validateToken(String token, UserDetails userDetails) {
        final String email = extractEmail(token);
        return (email.equals(userDetails.getUsername()) && !isTokenExpired(token));
    }

    private String createToken(Map<String, Object> claims, String email, int timeExpire) {
        return Jwts.builder()
                .setClaims(claims)
                .setSubject(email)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + timeExpire))
                .signWith(getSignKey(), SignatureAlgorithm.HS256).compact();
    }

    public Login generateToken(String email) {
        Map<String, Object> claimsAccessToken = new HashMap<>();
        String accessToken = createToken(claimsAccessToken, email, ACCESS_TOKEN_VALIDIY);
        String refreshToken = createToken(claimsAccessToken, email, REFRESH_TOKEN_VALIDIY);
        return new Login(accessToken, refreshToken);
    }

    public Login generateTokenFromRefreshToken(String refreshToken) {
        String email = extractEmail(refreshToken);
        Login setGenerateToken = generateToken(email);
        return new Login(setGenerateToken.getAccessToken(), setGenerateToken.getRefreshToken());
    }

}
