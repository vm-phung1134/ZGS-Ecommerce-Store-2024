package com.ecommerce.ecommercerestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.ecommercerestapi.entity.UserPayment;

@Repository
public interface UserPaymentRepository extends JpaRepository<UserPayment, Integer> {
    
}
