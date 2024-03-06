package com.ecommerce.ecommercerestapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.ecommercerestapi.entity.Discount;
import com.ecommerce.ecommercerestapi.repository.DiscountRepository;

@Service
public class DiscountService {
    @Autowired
    DiscountRepository discountRepository;

    public List<Discount> getAllDiscount() {
        return discountRepository.findAll();
    }

    public Discount getOneDiscount(Integer id) {
        Optional<Discount> discount = discountRepository.findById(id);
        if (discount.isPresent()) {
            return discount.get();
        }
        return null;
    }

    public Discount createDiscount(Discount discount) {
        if (discount != null) {
            Discount newDiscount = discountRepository.save(discount);
            return newDiscount;
        }
        return null;
    }

    public Boolean deleteDiscount(Integer id) {
        discountRepository.deleteById(id);
        boolean isDiscountDeleted = !discountRepository.existsById(id);
        if (isDiscountDeleted) {
            return true;
        }
        return false;
    }

    public Discount updateDiscount(Discount discount) {
        Optional<Discount> findDiscount = discountRepository.findById(discount.getId());
        if (findDiscount.isPresent()) {
            Discount discountUpdated = discountRepository.save(discount);
            return discountUpdated;
        }
        return null;
    }
}
