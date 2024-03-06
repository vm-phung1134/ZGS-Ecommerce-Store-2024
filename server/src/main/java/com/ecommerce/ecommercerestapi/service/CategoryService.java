package com.ecommerce.ecommercerestapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.ecommercerestapi.entity.Category;
import com.ecommerce.ecommercerestapi.repository.CategoryRepository;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public List<Category> getAllCategory() {
        return categoryRepository.findAll();
    }

    public Category getOneCategory(Integer id) {
        Optional<Category> category = categoryRepository.findById(id);
        if (category.isPresent()) {
            return category.get();
        }
        return null;
    }

    public Category createCategory(Category category) {
        if (category != null) {
            Category newCategory = categoryRepository.save(category);
            return newCategory;
        }
        return null;
    }

    public Boolean deleteCategory(Integer id) {
        categoryRepository.deleteById(id);
        boolean isCategoryDeleted = !categoryRepository.existsById(id);
        if (isCategoryDeleted) {
            return true;
        }
        return false;
    }

    public Category updateCategory(Category category) {
        Optional<Category> findCategory = categoryRepository.findById(category.getId());
        if (findCategory.isPresent()) {
            Category categoryUpdated = categoryRepository.save(category);
            return categoryUpdated;
        }
        return null;
    }
}
