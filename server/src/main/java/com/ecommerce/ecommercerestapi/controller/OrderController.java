package com.ecommerce.ecommercerestapi.controller;

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
import com.ecommerce.ecommercerestapi.entity.Order;
import com.ecommerce.ecommercerestapi.exception.NotFoundException;
import com.ecommerce.ecommercerestapi.model.response.ApiResponse;
import com.ecommerce.ecommercerestapi.service.OrderService;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/user-order")
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping
    public ApiResponse<String> createNewOrder(@RequestBody Order order) {
        Order newOrder = orderService.createOrder(order);
        if (newOrder.equals(null)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Fail items add to order!");
        }
        return new ApiResponse<String>(
                HttpStatus.CREATED.value(),
                ConstantMsg.CREATED_MSG,
                "Create successfully");
    }

    @GetMapping(value = "/{id}")
    public ApiResponse<Order> getOneOrder(@PathVariable Integer id) {
        Order order = orderService.getAllUserOrder(id);
        if (order.equals(null)) {
            throw new NotFoundException();
        }
        return new ApiResponse<Order>(
                HttpStatus.OK.value(),
                ConstantMsg.SUCCESS_MSG,
                order);
    }

    @PutMapping(value = "/{id}")
    public ApiResponse<Order> updateOrder(@PathVariable Integer id, @RequestBody Order order) {
        order.setId(id);
        Order updatedOrder = orderService.updateOrder(order);
        if (updatedOrder.equals(null)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Fail to update order!");
        }
        return new ApiResponse<Order>(
                HttpStatus.OK.value(),
                ConstantMsg.SUCCESS_MSG,
                updatedOrder);
    }

    @DeleteMapping(value = "/{id}")
    public ApiResponse<String> deleteOrder(@PathVariable Integer id) {
        Boolean isOrderDeleted = orderService.deleteOrder(id);
        if (!isOrderDeleted) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Fail to delete order!");

        }
        return new ApiResponse<String>(
                HttpStatus.OK.value(),
                ConstantMsg.DELETED_MSG,
                "Delete successfully");
    }
}
