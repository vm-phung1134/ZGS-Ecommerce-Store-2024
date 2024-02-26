package com.ecommerce.ecommercerestapi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.ecommercerestapi.entity.User;


@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    <T> Optional<T> findByEmail(String email);
}
