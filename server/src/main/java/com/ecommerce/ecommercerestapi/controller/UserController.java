package com.ecommerce.ecommercerestapi.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
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
import com.ecommerce.ecommercerestapi.exception.EmailOrPasswordInvalidException;
import com.ecommerce.ecommercerestapi.model.dto.AuthDto;
import com.ecommerce.ecommercerestapi.model.dto.UserDto;
import com.ecommerce.ecommercerestapi.model.mapper.AuthMapper;
import com.ecommerce.ecommercerestapi.model.mapper.UserMapper;
import com.ecommerce.ecommercerestapi.model.request.AuthRequest;
import com.ecommerce.ecommercerestapi.model.request.RegisterRequest;
import com.ecommerce.ecommercerestapi.model.request.ResetPasswordRequest;
import com.ecommerce.ecommercerestapi.model.response.ApiResponse;
import com.ecommerce.ecommercerestapi.service.UserService;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
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
    public ApiResponse<AuthDto> authenticatedAuth(@RequestBody AuthRequest authRequest, HttpServletResponse response) {
        User checkAccountUser = userService.checkEmailAndPasswordUser(authRequest);
        if (checkAccountUser.getEmail().equals(null)) {
            throw new EmailOrPasswordInvalidException();
        }
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(authRequest.getEmail(), authRequest.getPassword()));
        if (authentication.isAuthenticated()) {
            Login token = jwtUtils.generateToken(authRequest.getEmail());
            Cookie cookie = new Cookie("refresh_token", token.getRefreshToken());
            cookie.setMaxAge(7 * 24 * 60 * 60);
            cookie.setHttpOnly(true);
            response.addCookie(cookie);
            AuthDto authDto = AuthMapper.convertAuthDto(checkAccountUser, token);
            return new ApiResponse<AuthDto>(
                    HttpStatus.CREATED.value(),
                    ConstantMsg.CREATED_MSG,
                    authDto);
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
    public ApiResponse<UserDto> registerAuth(@RequestBody RegisterRequest registerRequest) {
        if (!Objects.equals(registerRequest.getPassword(), registerRequest.getPasswordConfirm()))
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Password do not match!");

        User user = userService.registerAuth(registerRequest);
        return new ApiResponse<UserDto>(
                HttpStatus.CREATED.value(),
                ConstantMsg.CREATED_MSG,
                UserMapper.convertUserResponse(user));
    }

    @PostMapping("/logout")
    public ApiResponse<String> logout(HttpServletResponse response) {
        Cookie cookie = new Cookie("refresh_token", null);
        cookie.setMaxAge(0);
        cookie.setHttpOnly(true);
        response.addCookie(cookie);
        return new ApiResponse<String>(
                HttpStatus.OK.value(),
                ConstantMsg.CREATED_MSG,
                "Logged out successfully");
    }

    @PostMapping(value = "/forgot")
    public ApiResponse<String> forgot(@RequestBody String email, HttpServletRequest request) {
        var originUrl = request.getHeader(HttpHeaders.ORIGIN);
        userService.forgot(email, originUrl);
        return new ApiResponse<String>(
                HttpStatus.OK.value(),
                ConstantMsg.CREATED_MSG,
                "Successfully");
    }

    @PostMapping(value = "/reset-password")
    public ApiResponse<String> resetPassword(@RequestBody ResetPasswordRequest resetPasswordRequest) {
        if (!Objects.equals(resetPasswordRequest.getPassword(), resetPasswordRequest.getPasswordConfirm()))
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Password do not match!");

        userService.resetPassword(resetPasswordRequest);
        return new ApiResponse<String>(
                HttpStatus.OK.value(),
                ConstantMsg.CREATED_MSG,
                "Successfully");
    }

}