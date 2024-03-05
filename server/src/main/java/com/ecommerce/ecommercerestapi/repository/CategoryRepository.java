package com.ecommerce.ecommercerestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.ecommercerestapi.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer>{
    
}
