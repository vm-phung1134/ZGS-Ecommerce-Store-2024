package com.ecommerce.ecommercerestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.ecommerce.ecommercerestapi.core.ConstantMsg;
import com.ecommerce.ecommercerestapi.entity.Product;
import com.ecommerce.ecommercerestapi.exception.NotFoundException;
import com.ecommerce.ecommercerestapi.model.dto.ProductRatingDto;
import com.ecommerce.ecommercerestapi.model.response.ApiResponse;
import com.ecommerce.ecommercerestapi.service.ProductService;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@CrossOrigin(origins = "http://localhost:5173")
@RestController
@RequestMapping("/api/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping
    public ApiResponse<List<ProductRatingDto>> getAllProduct() {
        List<ProductRatingDto> products = productService.getAllProduct();
        return new ApiResponse<List<ProductRatingDto>>(
                HttpStatus.OK.value(),
                ConstantMsg.SUCCESS_MSG,
                products);
    }

    @PostMapping
    public ApiResponse<String> createNewProduct(@RequestBody Product product) {
        Product newProduct = productService.createProduct(product);
        if (newProduct.equals(null)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Fail to create product!");
        }
        return new ApiResponse<String>(
                HttpStatus.CREATED.value(),
                ConstantMsg.CREATED_MSG,
                "Create successfully");
    }

    @GetMapping(value = "/{id}")
    public ApiResponse<Product> getOneProduct(@PathVariable Integer id) {
        Product product = productService.getOneProduct(id);
        if (product.equals(null)) {
            throw new NotFoundException();
        }
        return new ApiResponse<Product>(
                HttpStatus.OK.value(),
                ConstantMsg.SUCCESS_MSG,
                product);
    }

    @PutMapping(value = "/{id}")
    public ApiResponse<Product> updateProduct(@PathVariable Integer id, @RequestBody Product product) {
        product.setId(id);
        Product updatedProduct = productService.updateProduct(product);
        if (updatedProduct.equals(null)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Fail to update product!");
        }
        return new ApiResponse<Product>(
                HttpStatus.OK.value(),
                ConstantMsg.SUCCESS_MSG,
                updatedProduct);
    }

    @DeleteMapping(value = "/{id}")
    public ApiResponse<String> deleteProduct(@PathVariable Integer id) {
        Boolean isProductDeleted = productService.deleteProduct(id);
        if (!isProductDeleted) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Fail to delete product!");

        }
        return new ApiResponse<String>(
                HttpStatus.OK.value(),
                ConstantMsg.DELETED_MSG,
                "Delete successfully");
    }
}