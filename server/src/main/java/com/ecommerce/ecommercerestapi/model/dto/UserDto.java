package com.ecommerce.ecommercerestapi.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class UserDto {
    private String firstName;

    private String lastName;

    private String email;
    
    private String role;
}
