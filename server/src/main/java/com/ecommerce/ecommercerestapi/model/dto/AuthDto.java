package com.ecommerce.ecommercerestapi.model.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor

public class AuthDto extends UserDto {
    private String token;
    
    public AuthDto(
            Integer id,
            String firstName,
            String lastName,
            String email,
            String role,
            String token) {
        super(id, firstName, lastName, email, role);
        this.token = token;
    }
}
