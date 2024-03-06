package com.ecommerce.ecommercerestapi.model.mapper;

import java.util.ArrayList;
import java.util.List;

import com.ecommerce.ecommercerestapi.entity.Cart;
import com.ecommerce.ecommercerestapi.model.dto.ProductDto;

public class ProductMapper {
    public static List<ProductDto> convertToProductDtoList(List<Cart> cartList) {
        List<ProductDto> productDtoList = new ArrayList<>();

        for (Cart cart : cartList) {
            ProductDto productDto = new ProductDto();
            productDto.setId(cart.getProduct().getId());
            productDto.setName(cart.getProduct().getName());
            productDto.setImage(cart.getProduct().getImage());
            productDto.setPrice(cart.getProduct().getPrice());
            productDto.setCategory(cart.getProduct().getCategory());
            productDto.setInventory(cart.getProduct().getInventory());
            productDto.setDiscount(cart.getProduct().getDiscount());
            productDto.setQuantity(cart.getQuantity());
            productDtoList.add(productDto);
        }
        return productDtoList;
    }
}
