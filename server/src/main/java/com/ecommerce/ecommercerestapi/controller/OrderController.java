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
import com.ecommerce.ecommercerestapi.entity.Order;
import com.ecommerce.ecommercerestapi.exception.NotFoundException;
import com.ecommerce.ecommercerestapi.model.response.ApiResponse;
import com.ecommerce.ecommercerestapi.service.OrderService;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/order")
public class OrderController {
    @Autowired
    OrderService orderService;

    @GetMapping
    public ApiResponse<List<Order>> getAllOrder() {
        List<Order> products = orderService.getAllOrder();
        return new ApiResponse<List<Order>>(
                HttpStatus.OK.value(),
                ConstantMsg.SUCCESS_MSG,
                products);
    }

    @PostMapping
    public ApiResponse<String> createNewOrder(@RequestBody Order product) {
        Order newOrder = orderService.createOrder(product);
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
        Order product = orderService.getOneOrder(id);
        if (product.equals(null)) {
            throw new NotFoundException();
        }
        return new ApiResponse<Order>(
                HttpStatus.OK.value(),
                ConstantMsg.SUCCESS_MSG,
                product);
    }

    @PutMapping(value = "/{id}")
    public ApiResponse<Order> updateOrder(@PathVariable Integer id, @RequestBody Order product) {
        product.setId(id);
        Order updatedOrder = orderService.updateOrder(product);
        if (updatedOrder.equals(null)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Fail to update product!");
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
