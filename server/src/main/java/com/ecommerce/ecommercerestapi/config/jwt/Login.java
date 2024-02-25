package com.ecommerce.ecommercerestapi.config.jwt;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Login {
    private String accessToken;
    private String refreshToken;
}
