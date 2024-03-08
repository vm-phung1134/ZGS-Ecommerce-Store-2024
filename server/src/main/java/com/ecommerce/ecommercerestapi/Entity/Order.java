package com.ecommerce.ecommercerestapi.entity;

import java.sql.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private User user;

    @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private Product product;

    @Column(name = "sub_total")
    private Double subTotal;

    @Column(name = "sub_quantity")
    private Integer subQuantity;

    @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private UserPayment userPayment;

    @ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE })
    private UserAddress userAddress;

    @Column(name = "date_order")
    private Date dateOrder;

    private Boolean active;
}
