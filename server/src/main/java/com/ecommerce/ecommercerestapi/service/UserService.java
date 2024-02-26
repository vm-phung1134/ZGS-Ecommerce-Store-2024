package com.ecommerce.ecommercerestapi.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.ecommerce.ecommercerestapi.core.ConstantMsg;
import com.ecommerce.ecommercerestapi.entity.User;
import com.ecommerce.ecommercerestapi.exception.EmailExistException;
import com.ecommerce.ecommercerestapi.exception.NotFoundException;
import com.ecommerce.ecommercerestapi.model.request.AuthRequest;
import com.ecommerce.ecommercerestapi.model.request.RegisterRequest;
import com.ecommerce.ecommercerestapi.model.request.ResetPasswordRequest;
import com.ecommerce.ecommercerestapi.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    MailService mailService;

    @Autowired
    PasswordEncoder passwordEncoder;

    public Boolean checkEmailAndPasswordUser(AuthRequest authRequest) {
        Optional<User> user = userRepository.findByEmail(authRequest.getEmail());
        if (user.isPresent()) {
            User existingUser = user.get();
            Boolean emailCheck = existingUser.getEmail().equals(authRequest.getEmail());
            Boolean passwordCheck = passwordEncoder.matches(authRequest.getPassword(), existingUser.getPassword());
            if (emailCheck && passwordCheck) {
                return true;
            }
        }
        return false;
    }

    public User registerAuth(RegisterRequest registerRequest) {
        String email = registerRequest.getEmail();
        Optional<Boolean> userOptional = userRepository.findByEmail(email);
        if (userOptional.isPresent()) {
            throw new EmailExistException();
        }
        return userRepository.save(
                new User(
                        null,
                        registerRequest.getFirstName(),
                        registerRequest.getLastName(),
                        email,
                        passwordEncoder.encode(registerRequest.getPassword()),
                        ConstantMsg.ROLE_USER_DEFAULT));
    }

    public void forgot(String email, String originUrl) {
        userRepository.findByEmail(email)
                .orElseThrow(NotFoundException::new);
        mailService.sendForgotMessage(email, originUrl);
    }

    public void resetPassword(ResetPasswordRequest resetPasswordRequest) {
        Optional<User> user = userRepository.findByEmail(resetPasswordRequest.getEmail());
        if (user.isPresent()) {
            User existingUser = user.get();
            existingUser.setPassword(passwordEncoder.encode(resetPasswordRequest.getPassword()));
            userRepository.save(existingUser);
        }
    }

}
