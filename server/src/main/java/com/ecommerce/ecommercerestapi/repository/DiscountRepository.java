package com.ecommerce.ecommercerestapi.repository;

import org.springframework.stereotype.Repository;

import com.ecommerce.ecommercerestapi.entity.Discount;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface DiscountRepository extends JpaRepository<Discount, Integer> {
    
}
