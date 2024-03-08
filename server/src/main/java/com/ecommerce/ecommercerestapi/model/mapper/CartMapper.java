package com.ecommerce.ecommercerestapi.model.mapper;

import java.util.List;

import com.ecommerce.ecommercerestapi.entity.Cart;
import com.ecommerce.ecommercerestapi.model.dto.CartDto;

public class CartMapper {
    public static CartDto convertToCartDtoList(List<Cart> cartList) {
        CartDto cartDto = new CartDto();
        cartDto.setId(cartList.get(0).getId());
        cartDto.setProducts(ProductMapper.convertToProductDtoList(cartList));
        cartDto.setUser(cartList.get(0).getUser());
        return cartDto;
    }
}
