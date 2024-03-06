package com.ecommerce.ecommercerestapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.ecommercerestapi.entity.Order;

import com.ecommerce.ecommercerestapi.repository.OrderRepository;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    public List<Order> getAllOrder() {
        return orderRepository.findAll();
    }

    public Order getOneOrder(Integer id) {
        Optional<Order> order = orderRepository.findById(id);
        if (order.isPresent()) {
            return order.get();
        }
        return null;
    }

    public Order createOrder(Order order) {
        if (order != null) {
            Order newOrder = orderRepository.save(order);
            return newOrder;
        }
        return null;
    }

    public Boolean deleteOrder(Integer id) {
        orderRepository.deleteById(id);
        boolean isOrderDeleted = !orderRepository.existsById(id);
        if (isOrderDeleted) {
            return true;
        }
        return false;
    }

    public Order updateOrder(Order order) {
        Optional<Order> findOrder = orderRepository.findById(order.getId());
        if (findOrder.isPresent()) {
            Order orderUpdated = orderRepository.save(order);
            return orderUpdated;
        }
        return null;
    }
}

