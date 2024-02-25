package com.ecommerce.ecommercerestapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/product")
public class ProductController {
    @GetMapping("/welcome")
    public String welcome() {
        return "Welcome this endpoint is not secure";
    }
}
