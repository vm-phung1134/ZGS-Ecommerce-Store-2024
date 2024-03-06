package com.ecommerce.ecommercerestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.ecommerce.ecommercerestapi.core.ConstantMsg;
import com.ecommerce.ecommercerestapi.entity.Cart;
import com.ecommerce.ecommercerestapi.exception.NotFoundException;
import com.ecommerce.ecommercerestapi.model.dto.CartDto;
import com.ecommerce.ecommercerestapi.model.mapper.CartMapper;
import com.ecommerce.ecommercerestapi.model.response.ApiResponse;
import com.ecommerce.ecommercerestapi.service.CartService;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/shopping-cart")
public class CartController {
    @Autowired
    CartService cartService;

    @PostMapping
    public ApiResponse<String> createNewCart(@RequestBody Cart cart) {
        if (cart.equals(null)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Fail items add to cart!");
        } else {
            cartService.createCart(cart);
            return new ApiResponse<String>(
                    HttpStatus.CREATED.value(),
                    ConstantMsg.CREATED_MSG,
                    "Create successfully");
        }
    }

    @GetMapping(value = "/{id}")
    public ApiResponse<CartDto> getOneCart(@PathVariable Integer id) {
        List<Cart> product = cartService.getOneCart(id);
        if (product.equals(null)) {
            throw new NotFoundException();
        }
        CartDto cartDto = CartMapper.convertToCartDtoList(product);
        return new ApiResponse<CartDto>(
                HttpStatus.OK.value(),
                ConstantMsg.SUCCESS_MSG,
                cartDto);
    }

    @PutMapping(value = "/{id}")
    public ApiResponse<Cart> updateCart(@PathVariable Integer id, @RequestBody Cart product) {
        product.setId(id);
        Cart updatedCart = cartService.updateCart(product);
        if (updatedCart.equals(null)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Fail to update product!");
        }
        return new ApiResponse<Cart>(
                HttpStatus.OK.value(),
                ConstantMsg.SUCCESS_MSG,
                updatedCart);
    }

    @DeleteMapping(value = "/{id}")
    public ApiResponse<String> deleteCart(@PathVariable Integer id) {
        Boolean isCartDeleted = cartService.deleteCart(id);
        if (!isCartDeleted) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Fail to delete cart!");

        }
        return new ApiResponse<String>(
                HttpStatus.OK.value(),
                ConstantMsg.DELETED_MSG,
                "Delete successfully");
    }
}
