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
import com.ecommerce.ecommercerestapi.entity.Category;
import com.ecommerce.ecommercerestapi.exception.NotFoundException;
import com.ecommerce.ecommercerestapi.model.response.ApiResponse;
import com.ecommerce.ecommercerestapi.service.CategoryService;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping("/api/category")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @GetMapping
    public ApiResponse<List<Category>> getAllCategory() {
        List<Category> categorys = categoryService.getAllCategory();
        return new ApiResponse<List<Category>>(
                HttpStatus.OK.value(),
                ConstantMsg.SUCCESS_MSG,
                categorys);
    }

    @PostMapping(value = "/create")
    public ApiResponse<String> createNewCategory(@RequestBody Category category) {
        Category newCategory = categoryService.createCategory(category);
        if (newCategory.equals(null)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Fail to create category!");
        }
        return new ApiResponse<String>(
                HttpStatus.CREATED.value(),
                ConstantMsg.CREATED_MSG,
                "Create successfully");
    }

    @GetMapping(value = "/{id}")
    public ApiResponse<Category> getOneCategory(@PathVariable Integer id) {
        Category category = categoryService.getOneCategory(id);
        if (category.equals(null)) {
            throw new NotFoundException();
        }
        return new ApiResponse<Category>(
                HttpStatus.OK.value(),
                ConstantMsg.SUCCESS_MSG,
                category);
    }

    @PutMapping(value = "/{id}")
    public ApiResponse<Category> updateCategory(@PathVariable Integer id, @RequestBody Category category) {
        category.setId(id);
        Category updatedCategory = categoryService.updateCategory(category);
        if (updatedCategory.equals(null)) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Fail to update category!");
        }
        return new ApiResponse<Category>(
                HttpStatus.OK.value(),
                ConstantMsg.SUCCESS_MSG,
                updatedCategory);
    }

    @DeleteMapping(value = "/{id}")
    public ApiResponse<String> deleteCategory(@PathVariable Integer id) {
        Boolean isCategoryDeleted = categoryService.deleteCategory(id);
        if (!isCategoryDeleted) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Fail to delete category!");

        }
        return new ApiResponse<String>(
                HttpStatus.OK.value(),
                ConstantMsg.DELETED_MSG,
                "Delete successfully");
    }
}
