package com.ecommerce.ecommercerestapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.ecommercerestapi.entity.User;
import com.ecommerce.ecommercerestapi.entity.UserAddress;
import com.ecommerce.ecommercerestapi.repository.UserAddressRepository;
import com.ecommerce.ecommercerestapi.repository.UserRepository;

@Service
public class UserAddressService {
    @Autowired
    UserAddressRepository userAddressRepository;

    @Autowired
    UserRepository userRepository;

    public List<UserAddress> getAllUserAddress(Integer id) {
        List<UserAddress> userAddressList = userAddressRepository.findAllByUserId(id);
        if (userAddressList.size() > 0) {
            return userAddressList;
        }
        return null;
    }

    public UserAddress createUserAddress(UserAddress userAddress) {
        User user = userRepository.findById(userAddress.getUser().getId()).orElse(null);
        userAddress.setUser(user);
        List<UserAddress> userAddresss = userAddressRepository.findAllByUserId(userAddress.getUser().getId());
        if (userAddresss.size() > 0) {
            userAddress.setActive(false);
        } else {
            userAddress.setActive(true);
        }
        UserAddress newUserPayment = userAddressRepository.save(userAddress);
        return newUserPayment;
    }

    public Boolean deleteUserAddress(Integer id) {
        userAddressRepository.deleteById(id);
        boolean isUserAddressDeleted = !userAddressRepository.existsById(id);
        if (isUserAddressDeleted) {
            return true;
        }
        return false;
    }

    public UserAddress updateUserAddress(UserAddress userAddress) {
        List<UserAddress> findUserAddresss = userAddressRepository.findAllByUserId(userAddress.getUser().getId());
        Optional<UserAddress> result = findUserAddresss.stream()
                .filter(obj -> obj.getId() == userAddress.getId())
                .findFirst();
        User user = userRepository.findById(userAddress.getUser().getId()).orElse(null);

        if (result.isPresent()) {
            result.ifPresent(rs -> {
                findUserAddresss.forEach(payment -> {
                    if (payment.getId() != rs.getId()) {
                        payment.setActive(false);
                    }
                });
            });
            UserAddress updatedUserAddress = result.get();
            updatedUserAddress.setActive(true);
            updatedUserAddress.setUser(user);
            UserAddress userAddressUpdated = userAddressRepository.save(updatedUserAddress);
            return userAddressUpdated;
        }
        return null;
    }
}
