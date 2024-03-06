package com.ecommerce.ecommercerestapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.ecommercerestapi.entity.UserPayment;

import com.ecommerce.ecommercerestapi.repository.UserPaymentRepository;

@Service
public class UserPaymentService {
    @Autowired
    UserPaymentRepository userPaymentRepository;

    public List<UserPayment> getAllUserPayment() {
        return userPaymentRepository.findAll();
    }

    public UserPayment getOneUserPayment(Integer id) {
        Optional<UserPayment> userPayment = userPaymentRepository.findById(id);
        if (userPayment.isPresent()) {
            return userPayment.get();
        }
        return null;
    }

    public UserPayment createUserPayment(UserPayment userPayment) {
        if (userPayment != null) {
            UserPayment newUserPayment = userPaymentRepository.save(userPayment);
            return newUserPayment;
        }
        return null;
    }

    public Boolean deleteUserPayment(Integer id) {
        userPaymentRepository.deleteById(id);
        boolean isUserPaymentDeleted = !userPaymentRepository.existsById(id);
        if (isUserPaymentDeleted) {
            return true;
        }
        return false;
    }

    public UserPayment updateUserPayment(UserPayment userPayment) {
        Optional<UserPayment> findUserPayment = userPaymentRepository.findById(userPayment.getId());
        if (findUserPayment.isPresent()) {
            UserPayment userPaymentUpdated = userPaymentRepository.save(userPayment);
            return userPaymentUpdated;
        }
        return null;
    }
}
