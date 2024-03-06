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
import com.ecommerce.ecommercerestapi.model.response.ApiResponse;
import com.ecommerce.ecommercerestapi.service.CartService;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/shopping-cart")
public class CartController {
    @Autowired
    CartService cartService;

    @GetMapping
    public ApiResponse<List<Cart>> getAllCart() {
        List<Cart> products = cartService.getAllCart();
        return new ApiResponse<List<Cart>>(
                HttpStatus.OK.value(),
                ConstantMsg.SUCCESS_MSG,
                products);
    }

    @PostMapping
    public ApiResponse<String> createNewCart(@RequestBody Cart product) {
        Cart newCart = cartService.createCart(product);
        if (newCart.equals(null)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Fail items add to cart!");
        }
        return new ApiResponse<String>(
                HttpStatus.CREATED.value(),
                ConstantMsg.CREATED_MSG,
                "Create successfully");
    }

    @GetMapping(value = "/{id}")
    public ApiResponse<Cart> getOneCart(@PathVariable Integer id) {
        Cart product = cartService.getOneCart(id);
        if (product.equals(null)) {
            throw new NotFoundException();
        }
        return new ApiResponse<Cart>(
                HttpStatus.OK.value(),
                ConstantMsg.SUCCESS_MSG,
                product);
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
