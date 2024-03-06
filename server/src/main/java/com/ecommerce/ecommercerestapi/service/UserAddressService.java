package com.ecommerce.ecommercerestapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.ecommercerestapi.entity.UserAddress;

import com.ecommerce.ecommercerestapi.repository.UserAddressRepository;

@Service
public class UserAddressService {
    @Autowired
    UserAddressRepository userAddressRepository;

    public List<UserAddress> getAllUserAddress() {
        return userAddressRepository.findAll();
    }

    public UserAddress getOneUserAddress(Integer id) {
        Optional<UserAddress> userAddress = userAddressRepository.findById(id);
        if (userAddress.isPresent()) {
            return userAddress.get();
        }
        return null;
    }

    public UserAddress createUserAddress(UserAddress userAddress) {
        if (userAddress != null) {
            UserAddress newUserAddress = userAddressRepository.save(userAddress);
            return newUserAddress;
        }
        return null;
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
        Optional<UserAddress> findUserAddress = userAddressRepository.findById(userAddress.getId());
        if (findUserAddress.isPresent()) {
            UserAddress userAddressUpdated = userAddressRepository.save(userAddress);
            return userAddressUpdated;
        }
        return null;
    }
}
