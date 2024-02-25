package com.ecommerce.ecommercerestapi.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ecommerce.ecommercerestapi.entity.User;
import com.ecommerce.ecommercerestapi.exception.EmailExistException;
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
    String email = registerRequest.getEmail();
    // Check exists email
    Optional<Boolean> userOptional = userRepository.findByEmail(email);
    if (userOptional.isPresent()) {
        throw new EmailExistException();
    }
    
    // Save new user 
    return userRepository.save(
        new User(
            null,
            registerRequest.getFirstName(),
            registerRequest.getLastName(),
            email,
            passwordEncoder.encode(registerRequest.getPassword()),
            ROLE_USER_DEFAULT
        )
    );
}

}
