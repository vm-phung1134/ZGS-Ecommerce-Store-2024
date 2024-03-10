package com.ecommerce.ecommercerestapi.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.ecommercerestapi.entity.Cart;
import com.ecommerce.ecommercerestapi.entity.Order;
import com.ecommerce.ecommercerestapi.entity.User;
import com.ecommerce.ecommercerestapi.entity.UserAddress;
import com.ecommerce.ecommercerestapi.entity.UserPayment;
import com.ecommerce.ecommercerestapi.repository.CartRepository;
import com.ecommerce.ecommercerestapi.repository.OrderRepository;
import com.ecommerce.ecommercerestapi.repository.UserAddressRepository;
import com.ecommerce.ecommercerestapi.repository.UserPaymentRepository;
import com.ecommerce.ecommercerestapi.repository.UserRepository;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    @Autowired
    UserRepository userRepository;

    @Autowired
    UserPaymentRepository userPaymentRepository;

    @Autowired
    UserAddressRepository userAddressRepository;

    @Autowired
    CartRepository cartRepository;

    public List<Order> getAllUserOrder(Integer id) {
        List<Order> orders = orderRepository.findAllByUserId(id);
        if (orders.size() > 0) {
            return orders.stream()
                    .filter(object -> !object.getActive())
                    .collect(Collectors.toList());
        }
        return null;
    }

    public List<Order> getAllHistoryOrder(Integer id) {
        List<Order> orders = orderRepository.findAllByUserId(id);
        if (orders.size() > 0) {
            return orders.stream()
                    .filter(object -> object.getActive())
                    .collect(Collectors.toList());
        }
        return null;
    }

    public Order createOrder(Order order) {
        User user = userRepository.findById(order.getUser().getId()).orElse(null);
        UserPayment userPayment = userPaymentRepository.findById(order.getUserPayment().getId()).orElse(null);
        UserAddress userAddress = userAddressRepository.findById(order.getUserAddress().getId()).orElse(null);
        List<Cart> listCarts = cartRepository.findAllByUserId(user.getId());

        for (Cart cart : listCarts) {
            Order newOrder = new Order();
            newOrder.setUser(user);
            newOrder.setUserAddress(userAddress);
            newOrder.setUserPayment(userPayment);
            newOrder.setActive(false);
            newOrder.setSubTotal(cart.getProduct().getPrice() * cart.getQuantity());
            newOrder.setDateOrder(order.getDateOrder());
            newOrder.setProduct(cart.getProduct());
            newOrder.setSubQuantity(cart.getQuantity());
            orderRepository.save(newOrder);
            cartRepository.deleteById(cart.getId());
        }
        return order;
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
