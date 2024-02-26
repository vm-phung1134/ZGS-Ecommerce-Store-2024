package com.ecommerce.ecommercerestapi.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResetPasswordRequest {
    
    private String email;
    
    private String password;

    @JsonProperty("password_confirm")
    private String passwordConfirm;
}
