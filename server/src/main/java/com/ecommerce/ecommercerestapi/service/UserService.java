package com.ecommerce.ecommercerestapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.ecommercerestapi.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
}
