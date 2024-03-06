package com.ecommerce.ecommercerestapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.ecommercerestapi.entity.Cart;

import com.ecommerce.ecommercerestapi.repository.CartRepository;

@Service
public class CartService {
    @Autowired
    CartRepository cartRepository;

    public List<Cart> getOneCart(Integer userId) {
        List<Cart> carts = cartRepository.findAll();
        return carts;
    }

    public Cart createCart(Cart cart) {
        if (cart != null) {
            Cart newCart = cartRepository.save(cart);
            return newCart;
        }
        return null;
    }

    public Boolean deleteCart(Integer id) {
        cartRepository.deleteById(id);
        boolean isCartDeleted = !cartRepository.existsById(id);
        if (isCartDeleted) {
            return true;
        }
        return false;
    }

    public Cart updateCart(Cart cart) {
        Optional<Cart> findCart = cartRepository.findById(cart.getId());
        if (findCart.isPresent()) {
            Cart cartUpdated = cartRepository.save(cart);
            return cartUpdated;
        }
        return null;
    }
}
