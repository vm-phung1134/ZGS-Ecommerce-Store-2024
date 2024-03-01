package com.ecommerce.ecommercerestapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.ecommercerestapi.entity.Product;
import com.ecommerce.ecommercerestapi.repository.ProductRepository;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }

    public Product getOneProduct(Integer id) {
        Optional<Product> product = productRepository.findById(id);
        if (product.isPresent()) {
            return product.get();
        }
        return null;
    }

    public Product createProduct(Product product) {
        Product existingProduct = productRepository.findByName(product.getName());
        if (existingProduct == null) {
            Product newProduct = productRepository.save(product);
            return newProduct;
        }
        return null;
    }

    public Boolean deleteProduct(Integer id) {
        productRepository.deleteById(id);
        boolean isProductDeleted = !productRepository.existsById(id);
        if (isProductDeleted) {
            return true;
        }
        return false;
    }

    public Product updateProduct(Product product) {
        Optional<Product> findProduct = productRepository.findById(product.getId());
        if (findProduct.isPresent()) {
            Product productUpdated = productRepository.save(product);
            return productUpdated;
        }
        return null;
    }
}
