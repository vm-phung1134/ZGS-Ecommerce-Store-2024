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
import com.ecommerce.ecommercerestapi.entity.UserAddress;
import com.ecommerce.ecommercerestapi.exception.NotFoundException;
import com.ecommerce.ecommercerestapi.model.response.ApiResponse;
import com.ecommerce.ecommercerestapi.service.UserAddressService;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/user-address")
public class UserAddressController {
    @Autowired
    UserAddressService userAddressService;

    @GetMapping
    public ApiResponse<List<UserAddress>> getAllUserAddress() {
        List<UserAddress> userAddresss = userAddressService.getAllUserAddress();
        return new ApiResponse<List<UserAddress>>(
                HttpStatus.OK.value(),
                ConstantMsg.SUCCESS_MSG,
                userAddresss);
    }

    @PostMapping(value = "/create")
    public ApiResponse<String> createNewUserAddress(@RequestBody UserAddress userAddress) {
        UserAddress newUserAddress = userAddressService.createUserAddress(userAddress);
        if (newUserAddress.equals(null)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Fail to create userAddress!");
        }
        return new ApiResponse<String>(
                HttpStatus.CREATED.value(),
                ConstantMsg.CREATED_MSG,
                "Create successfully");
    }

    @GetMapping(value = "/{id}")
    public ApiResponse<UserAddress> getOneUserAddress(@PathVariable Integer id) {
        UserAddress userAddress = userAddressService.getOneUserAddress(id);
        if (userAddress.equals(null)) {
            throw new NotFoundException();
        }
        return new ApiResponse<UserAddress>(
                HttpStatus.OK.value(),
                ConstantMsg.SUCCESS_MSG,
                userAddress);
    }

    @PutMapping(value = "/{id}")
    public ApiResponse<UserAddress> updateUserAddress(@PathVariable Integer id, @RequestBody UserAddress userAddress) {
        userAddress.setId(id);
        UserAddress updatedUserAddress = userAddressService.updateUserAddress(userAddress);
        if (updatedUserAddress.equals(null)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Fail to update userAddress!");
        }
        return new ApiResponse<UserAddress>(
                HttpStatus.OK.value(),
                ConstantMsg.SUCCESS_MSG,
                updatedUserAddress);
    }

    @DeleteMapping(value = "/{id}")
    public ApiResponse<String> deleteUserAddress(@PathVariable Integer id) {
        Boolean isUserAddressDeleted = userAddressService.deleteUserAddress(id);
        if (!isUserAddressDeleted) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Fail to delete userAddress!");

        }
        return new ApiResponse<String>(
                HttpStatus.OK.value(),
                ConstantMsg.DELETED_MSG,
                "Delete successfully");
    }
}