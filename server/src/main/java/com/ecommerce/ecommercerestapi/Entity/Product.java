package com.ecommerce.ecommercerestapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String image;
    private Double price;

    // @OneToMany
    @JoinColumn(name = "category_id")
    private Integer categoryId;

    // @OneToOne
    @JoinColumn(name = "inventory_id")
    private Integer inventoryId;

    // @OneToOne
    @JoinColumn(name = "discount_id")
    private Integer discountId;
}
