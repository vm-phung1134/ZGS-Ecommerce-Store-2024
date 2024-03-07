package com.ecommerce.ecommercerestapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.ecommercerestapi.entity.User;
import com.ecommerce.ecommercerestapi.entity.UserPayment;

import com.ecommerce.ecommercerestapi.repository.UserPaymentRepository;
import com.ecommerce.ecommercerestapi.repository.UserRepository;

@Service
public class UserPaymentService {
    @Autowired
    UserPaymentRepository userPaymentRepository;

    @Autowired
    UserRepository userRepository;

    public List<UserPayment> getAllUserPayment(Integer id) {
        List<UserPayment> findUserPayments = userPaymentRepository.findAllByUserId(id);
        if (findUserPayments.size() != 0) {
            return findUserPayments;
        }
        return null;
    }

    public UserPayment createUserPayment(UserPayment userPayment) {
        User user = userRepository.findById(userPayment.getUser().getId()).orElse(null);
        userPayment.setUser(user);
        List<UserPayment> userPayments = userPaymentRepository.findAllByUserId(userPayment.getUser().getId());
        if (userPayments.size() > 0) {
            userPayment.setActive(false);
        } else {
            userPayment.setActive(true);
        }
        UserPayment newUserPayment = userPaymentRepository.save(userPayment);
        return newUserPayment;
    }

    public Boolean deleteUserPayment(Integer id) {
        userPaymentRepository.deleteById(id);
        boolean isUserPaymentDeleted = !userPaymentRepository.existsById(id);
        if (isUserPaymentDeleted) {
            return true;
        }
        return false;
    }

    // UPDATE SET PAYMENT METHOD DEFAULT
    public UserPayment updateUserPayment(UserPayment userPayment) {
        List<UserPayment> findUserPayments = userPaymentRepository.findAllByUserId(userPayment.getUser().getId());
        Optional<UserPayment> result = findUserPayments.stream()
                .filter(obj -> obj.getId() == userPayment.getId())
                .findFirst();
        User user = userRepository.findById(userPayment.getUser().getId()).orElse(null);
        
        if (result.isPresent()) {
            result.ifPresent(rs -> {
                findUserPayments.forEach(payment -> {
                    if (payment.getId() != rs.getId()) {
                        payment.setActive(false);
                    }
                });
            });
            UserPayment updatedUserPayment = result.get();
            updatedUserPayment.setActive(true);
            updatedUserPayment.setUser(user);
            UserPayment userPaymentUpdated = userPaymentRepository.save(updatedUserPayment);
            return userPaymentUpdated;
        }
        return null;
    }
}
