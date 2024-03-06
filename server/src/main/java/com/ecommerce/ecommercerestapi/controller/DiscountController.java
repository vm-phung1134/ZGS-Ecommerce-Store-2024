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
import com.ecommerce.ecommercerestapi.entity.Discount;
import com.ecommerce.ecommercerestapi.exception.NotFoundException;
import com.ecommerce.ecommercerestapi.model.response.ApiResponse;
import com.ecommerce.ecommercerestapi.service.DiscountService;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/discount")
public class DiscountController {
    @Autowired
    DiscountService discountService;

    @GetMapping
    public ApiResponse<List<Discount>> getAllDiscount() {
        List<Discount> discounts = discountService.getAllDiscount();
        return new ApiResponse<List<Discount>>(
                HttpStatus.OK.value(),
                ConstantMsg.SUCCESS_MSG,
                discounts);
    }

    @PostMapping(value = "/create")
    public ApiResponse<String> createNewDiscount(@RequestBody Discount discount) {
        Discount newDiscount = discountService.createDiscount(discount);
        if (newDiscount.equals(null)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Fail to create discount!");
        }
        return new ApiResponse<String>(
                HttpStatus.CREATED.value(),
                ConstantMsg.CREATED_MSG,
                "Create successfully");
    }

    @GetMapping(value = "/{id}")
    public ApiResponse<Discount> getOneDiscount(@PathVariable Integer id) {
        Discount discount = discountService.getOneDiscount(id);
        if (discount.equals(null)) {
            throw new NotFoundException();
        }
        return new ApiResponse<Discount>(
                HttpStatus.OK.value(),
                ConstantMsg.SUCCESS_MSG,
                discount);
    }

    @PutMapping(value = "/{id}")
    public ApiResponse<Discount> updateDiscount(@PathVariable Integer id, @RequestBody Discount discount) {
        discount.setId(id);
        Discount updatedDiscount = discountService.updateDiscount(discount);
        if (updatedDiscount.equals(null)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Fail to update discount!");
        }
        return new ApiResponse<Discount>(
                HttpStatus.OK.value(),
                ConstantMsg.SUCCESS_MSG,
                updatedDiscount);
    }

    @DeleteMapping(value = "/{id}")
    public ApiResponse<String> deleteDiscount(@PathVariable Integer id) {
        Boolean isDiscountDeleted = discountService.deleteDiscount(id);
        if (!isDiscountDeleted) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Fail to delete discount!");

        }
        return new ApiResponse<String>(
                HttpStatus.OK.value(),
                ConstantMsg.DELETED_MSG,
                "Delete successfully");
    }
}