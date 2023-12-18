package com.java.grocery.booking.grocerybooking.services;

import com.java.grocery.booking.grocerybooking.entity.GroceryEntity;

import java.util.List;

public interface GroceryService {
    List<GroceryEntity> getAllGrocery();
    GroceryEntity getGroceryById(Integer id);

    GroceryEntity addGrocery(GroceryEntity grocery);

    GroceryEntity updateGrocery(Integer groceryId, GroceryEntity grocery);

    void deleteGrocery(Integer groceryId);
}
