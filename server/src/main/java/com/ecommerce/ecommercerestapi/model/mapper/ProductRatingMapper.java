package com.ecommerce.ecommercerestapi.model.mapper;

import org.springframework.beans.factory.annotation.Autowired;

import com.ecommerce.ecommercerestapi.entity.Product;
import com.ecommerce.ecommercerestapi.model.dto.ProductRatingDto;
import com.ecommerce.ecommercerestapi.service.CommentService;

public class ProductRatingMapper {
    @Autowired
    CommentService commentService;

    public static ProductRatingDto convertToProductRatingDto(Product product, Double averageStar) {
        ProductRatingDto productRatingDto = new ProductRatingDto();
        productRatingDto.setId(product.getId());
        productRatingDto.setName(product.getName());
        productRatingDto.setImage(product.getImage());
        productRatingDto.setPrice(product.getPrice());
        productRatingDto.setCategory(product.getCategory());
        productRatingDto.setInventory(product.getInventory());
        productRatingDto.setDiscount(product.getDiscount());
        productRatingDto.setRating(averageStar);
        return productRatingDto;
    }
}
