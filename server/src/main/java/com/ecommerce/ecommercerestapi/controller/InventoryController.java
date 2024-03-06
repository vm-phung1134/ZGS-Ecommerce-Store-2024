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
import com.ecommerce.ecommercerestapi.entity.Inventory;
import com.ecommerce.ecommercerestapi.exception.NotFoundException;
import com.ecommerce.ecommercerestapi.model.response.ApiResponse;
import com.ecommerce.ecommercerestapi.service.InventoryService;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {
    @Autowired
    InventoryService inventoryService;

    @GetMapping
    public ApiResponse<List<Inventory>> getAllInventory() {
        List<Inventory> products = inventoryService.getAllInventory();
        return new ApiResponse<List<Inventory>>(
                HttpStatus.OK.value(),
                ConstantMsg.SUCCESS_MSG,
                products);
    }

    @PostMapping(value = "/create")
    public ApiResponse<String> createNewInventory(@RequestBody Inventory product) {
        Inventory newInventory = inventoryService.createInventory(product);
        if (newInventory.equals(null)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Fail to create inventory!");
        }
        return new ApiResponse<String>(
                HttpStatus.CREATED.value(),
                ConstantMsg.CREATED_MSG,
                "Create successfully");
    }

    @GetMapping(value = "/{id}")
    public ApiResponse<Inventory> getOneInventory(@PathVariable Integer id) {
        Inventory product = inventoryService.getOneInventory(id);
        if (product.equals(null)) {
            throw new NotFoundException();
        }
        return new ApiResponse<Inventory>(
                HttpStatus.OK.value(),
                ConstantMsg.SUCCESS_MSG,
                product);
    }

    @PutMapping(value = "/{id}")
    public ApiResponse<Inventory> updateInventory(@PathVariable Integer id, @RequestBody Inventory product) {
        product.setId(id);
        Inventory updatedInventory = inventoryService.updateInventory(product);
        if (updatedInventory.equals(null)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Fail to update product!");
        }
        return new ApiResponse<Inventory>(
                HttpStatus.OK.value(),
                ConstantMsg.SUCCESS_MSG,
                updatedInventory);
    }

    @DeleteMapping(value = "/{id}")
    public ApiResponse<String> deleteInventory(@PathVariable Integer id) {
        Boolean isInventoryDeleted = inventoryService.deleteInventory(id);
        if (!isInventoryDeleted) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Fail to delete inventory!");

        }
        return new ApiResponse<String>(
                HttpStatus.OK.value(),
                ConstantMsg.DELETED_MSG,
                "Delete successfully");
    }
}
