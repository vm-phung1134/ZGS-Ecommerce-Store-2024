package com.ecommerce.ecommercerestapi.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.ecommercerestapi.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

   List<Order> findAllByUserId(Integer userId);

}