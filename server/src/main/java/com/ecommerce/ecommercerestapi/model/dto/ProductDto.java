package com.ecommerce.ecommercerestapi.model.dto;

import com.ecommerce.ecommercerestapi.entity.Category;
import com.ecommerce.ecommercerestapi.entity.Discount;
import com.ecommerce.ecommercerestapi.entity.Inventory;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class ProductDto {

    private Integer id;

    private String name;

    private String image;

    private Double price;

    private Category category;

    private Inventory inventory;

    private Discount discount;

    private Integer quantity;
}
