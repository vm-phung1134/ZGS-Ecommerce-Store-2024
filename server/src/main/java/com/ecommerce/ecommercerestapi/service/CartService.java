package com.ecommerce.ecommercerestapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.ecommercerestapi.entity.Cart;
import com.ecommerce.ecommercerestapi.entity.Product;
import com.ecommerce.ecommercerestapi.entity.User;
import com.ecommerce.ecommercerestapi.repository.CartRepository;
import com.ecommerce.ecommercerestapi.repository.ProductRepository;
import com.ecommerce.ecommercerestapi.repository.UserRepository;

@Service
public class CartService {
    @Autowired
    CartRepository cartRepository;

    @Autowired
    ProductRepository productRepository;

    @Autowired
    UserRepository userRepository;

    public List<Cart> getOneCart(Integer userId) {
        List<Cart> carts = cartRepository.findAll();
        return carts;
    }

    public Cart createCart(Cart cart) {
        Optional<Cart> existingCart = cartRepository.findByProduct(cart.getProduct());
        if (existingCart.isEmpty()) {
            Product product = productRepository.findById(cart.getProduct().getId()).orElse(null);
            User user = userRepository.findById(cart.getUser().getId()).orElse(null);

            cart.setProduct(product);
            cart.setUser(user);

            Cart newCart = cartRepository.save(cart);
            return newCart;
        } else {
            Cart prevCart = existingCart.get();
            prevCart.setQuantity(prevCart.getQuantity() + cart.getQuantity());
            Cart updatedCart = cartRepository.save(prevCart);
            return updatedCart;
        }

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
