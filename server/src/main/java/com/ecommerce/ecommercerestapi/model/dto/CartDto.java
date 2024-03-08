package com.ecommerce.ecommercerestapi.model.dto;

import java.util.List;

import com.ecommerce.ecommercerestapi.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CartDto {
    private Integer id;
    private User user;
    private List<ProductDto> products;
}
