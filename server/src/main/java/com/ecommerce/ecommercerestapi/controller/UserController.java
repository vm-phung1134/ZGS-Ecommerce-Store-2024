package com.ecommerce.ecommercerestapi.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.ecommerce.ecommercerestapi.config.jwt.JwtUtils;
import com.ecommerce.ecommercerestapi.config.jwt.Login;
import com.ecommerce.ecommercerestapi.core.ConstantMsg;
import com.ecommerce.ecommercerestapi.entity.User;
import com.ecommerce.ecommercerestapi.model.dto.RegisterDto;
import com.ecommerce.ecommercerestapi.model.mapper.RegisterMapper;
import com.ecommerce.ecommercerestapi.model.request.AuthRequest;
import com.ecommerce.ecommercerestapi.model.request.RegisterRequest;
import com.ecommerce.ecommercerestapi.model.response.ApiResponse;
import com.ecommerce.ecommercerestapi.service.UserService;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/api/auth")
public class UserController {
    @Autowired
    UserService userService;

    @Autowired
    private JwtUtils jwtUtils;

    @Autowired
    private AuthenticationManager authenticationManager;

    @PostMapping(value = "/authenticated")
    public ApiResponse<String> authenticatedAuth(@RequestBody AuthRequest authRequest, HttpServletResponse response) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(authRequest.getEmail(), authRequest.getPassword()));
        if (authentication.isAuthenticated()) {
            Login token = jwtUtils.generateToken(authRequest.getEmail());
            Cookie cookie = new Cookie("refresh_token", token.getRefreshToken());
            cookie.setMaxAge(7 * 24 * 60 * 60);
            cookie.setHttpOnly(true);
            response.addCookie(cookie);
            return new ApiResponse<String>(
                    HttpStatus.CREATED.value(),
                    ConstantMsg.CREATED_MSG,
                    token.getAccessToken());
        } else {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "UnAuthenticated!");
        }
    }

    @PostMapping(value = "/refresh")
    public ApiResponse<String> refresh(
            @CookieValue(value = "refresh_token", required = false) String refreshToken) {
        Login newToken = jwtUtils.generateTokenFromRefreshToken(refreshToken);
        return new ApiResponse<String>(
                HttpStatus.CREATED.value(),
                ConstantMsg.CREATED_MSG,
                newToken.getAccessToken());
    }

    @PostMapping(value = "/register")
    public ApiResponse<RegisterDto> registerAuth(@RequestBody RegisterRequest registerRequest) {
        if (!Objects.equals(registerRequest.getPassword(), registerRequest.getPasswordConfirm()))
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Password do not match!");

        User user = userService.registerAuth(registerRequest);
        return new ApiResponse<RegisterDto>(
                HttpStatus.CREATED.value(),
                ConstantMsg.CREATED_MSG,
                RegisterMapper.convertUserResponse(user));
    }

}