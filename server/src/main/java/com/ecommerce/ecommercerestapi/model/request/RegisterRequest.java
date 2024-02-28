package com.ecommerce.ecommercerestapi.model.request;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private String passwordConfirm;
}
