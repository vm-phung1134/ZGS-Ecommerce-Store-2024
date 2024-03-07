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
import com.ecommerce.ecommercerestapi.entity.UserPayment;
import com.ecommerce.ecommercerestapi.exception.NotFoundException;
import com.ecommerce.ecommercerestapi.model.response.ApiResponse;
import com.ecommerce.ecommercerestapi.service.UserPaymentService;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/user-payment")
public class UserPaymentController {
    @Autowired
    UserPaymentService userPaymentService;

    @PostMapping
    public ApiResponse<String> createNewUserPayment(@RequestBody UserPayment userPayment) {
        UserPayment newUserPayment = userPaymentService.createUserPayment(userPayment);
        if (newUserPayment.equals(null)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Fail to create userPayment!");
        }
        return new ApiResponse<String>(
                HttpStatus.CREATED.value(),
                ConstantMsg.CREATED_MSG,
                "Create successfully");
    }

    @GetMapping(value = "/{id}")
    public ApiResponse<List<UserPayment>> getAllUserPayment(@PathVariable Integer id) {
        List<UserPayment> userPayments = userPaymentService.getAllUserPayment(id);
        if (userPayments.size() == 0) {
            throw new NotFoundException();
        }
        return new ApiResponse<List<UserPayment>>(
                HttpStatus.OK.value(),
                ConstantMsg.SUCCESS_MSG,
                userPayments);
    }

    @PutMapping(value = "/{id}")
    public ApiResponse<UserPayment> updateUserPayment(@PathVariable Integer id, @RequestBody UserPayment userPayment) {
        userPayment.setId(id);
        UserPayment updatedUserPayment = userPaymentService.updateUserPayment(userPayment);
        if (updatedUserPayment.equals(null)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Fail to update userPayment!");
        }
        return new ApiResponse<UserPayment>(
                HttpStatus.OK.value(),
                ConstantMsg.SUCCESS_MSG,
                updatedUserPayment);
    }

    @DeleteMapping(value = "/{id}")
    public ApiResponse<String> deleteUserPayment(@PathVariable Integer id) {
        Boolean isUserPaymentDeleted = userPaymentService.deleteUserPayment(id);
        if (!isUserPaymentDeleted) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Fail to delete userPayment!");

        }
        return new ApiResponse<String>(
                HttpStatus.OK.value(),
                ConstantMsg.DELETED_MSG,
                "Delete successfully");
    }
}
