package com.ecommerce.ecommercerestapi.model.mapper;

import com.ecommerce.ecommercerestapi.entity.User;
import com.ecommerce.ecommercerestapi.model.dto.UserDto;

public class UserMapper {
    public static UserDto convertUserResponse(User user) {
        return new UserDto(
                user.getId(),
                user.getFirstName(),
                user.getLastName(),
                user.getEmail(),
                user.getRole());
    }
}