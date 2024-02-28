package com.ecommerce.ecommercerestapi.model.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResetPasswordRequest {
    
    private String email;
    
    private String password;

    private String passwordConfirm;
}
