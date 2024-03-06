package com.ecommerce.ecommercerestapi.model.mapper;

import com.ecommerce.ecommercerestapi.config.jwt.Login;
import com.ecommerce.ecommercerestapi.entity.User;
import com.ecommerce.ecommercerestapi.model.dto.AuthDto;

public class AuthMapper {
    public static AuthDto convertAuthDto(User user, Login token) {
        return new AuthDto(
            user.getId(), 
            user.getFirstName(),
            user.getLastName(),
            user.getEmail(),
            user.getRole(),
            token.getAccessToken()
        );
    }
}
