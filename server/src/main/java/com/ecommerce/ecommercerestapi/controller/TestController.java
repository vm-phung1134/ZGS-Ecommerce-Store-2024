package com.ecommerce.ecommercerestapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")
public class TestController {
    @GetMapping
    public String welcome() {
        return "Welcome this endpoint is not secure";
    }
}
