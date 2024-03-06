package com.ecommerce.ecommercerestapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.ecommercerestapi.entity.Inventory;

import com.ecommerce.ecommercerestapi.repository.InventoryRepository;

@Service
public class InventoryService {
    @Autowired
    InventoryRepository inventoryRepository;

    public List<Inventory> getAllInventory() {
        return inventoryRepository.findAll();
    }

    public Inventory getOneInventory(Integer id) {
        Optional<Inventory> inventory = inventoryRepository.findById(id);
        if (inventory.isPresent()) {
            return inventory.get();
        }
        return null;
    }

    public Inventory createInventory(Inventory inventory) {
        if (inventory != null) {
            Inventory newInventory = inventoryRepository.save(inventory);
            return newInventory;
        }
        return null;
    }

    public Boolean deleteInventory(Integer id) {
        inventoryRepository.deleteById(id);
        boolean isInventoryDeleted = !inventoryRepository.existsById(id);
        if (isInventoryDeleted) {
            return true;
        }
        return false;
    }

    public Inventory updateInventory(Inventory inventory) {
        Optional<Inventory> findInventory = inventoryRepository.findById(inventory.getId());
        if (findInventory.isPresent()) {
            Inventory inventoryUpdated = inventoryRepository.save(inventory);
            return inventoryUpdated;
        }
        return null;
    }
}
