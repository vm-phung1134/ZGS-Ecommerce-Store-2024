package com.ecommerce.ecommercerestapi.model.mapper;

import com.ecommerce.ecommercerestapi.Entity.User;
import com.ecommerce.ecommercerestapi.model.dto.RegisterDto;

public class RegisterMapper {
    public static RegisterDto convertUserResponse(User user){
        RegisterDto registerDto = new RegisterDto();
        registerDto.setEmail(user.getEmail());
        registerDto.setFirstName(user.getFirstName());
        registerDto.setLastName(user.getLastName());
        registerDto.setRole(user.getRole());
        return registerDto;
    }
}