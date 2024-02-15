package com.ecommerce.ecommercerestapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ecommerce.ecommercerestapi.Entity.User;
import com.ecommerce.ecommercerestapi.model.request.RegisterRequest;
import com.ecommerce.ecommercerestapi.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    PasswordEncoder passwordEncoder;

    private static final String ROLE_USER_DEFAULT = "USER";

    public User registerAuth(RegisterRequest registerRequest) {
        return userRepository.save(
                new User(
                        null, registerRequest.getFirstName(),
                        registerRequest.getLastName(),
                        registerRequest.getEmail(),
                        passwordEncoder.encode(registerRequest.getPassword()),
                        ROLE_USER_DEFAULT
                ));
    }
}
