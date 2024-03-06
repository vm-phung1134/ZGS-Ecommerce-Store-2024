package com.ecommerce.ecommercerestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.ecommercerestapi.entity.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Integer> {

}
