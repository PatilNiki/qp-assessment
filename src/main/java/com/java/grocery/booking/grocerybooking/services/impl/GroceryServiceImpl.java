package com.java.grocery.booking.grocerybooking.services.impl;

import com.java.grocery.booking.grocerybooking.dao.GroceryDao;
import com.java.grocery.booking.grocerybooking.entity.GroceryEntity;
import com.java.grocery.booking.grocerybooking.services.GroceryService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GroceryServiceImpl implements GroceryService {

    private final GroceryDao groceryDao;

    @Override
    public List<GroceryEntity> getAllGrocery() {
        return groceryDao.findAll();
    }

    @Override
    public GroceryEntity getGroceryById(Integer id) {
        return groceryDao.findById(id).orElse(null);
    }

    @Override
    public GroceryEntity addGrocery(GroceryEntity grocery) {
        return groceryDao.save(grocery);
    }

    @Override
    public GroceryEntity updateGrocery(Integer id, GroceryEntity grocery) {
        GroceryEntity groceryEntity = groceryDao.findById(id).orElse(null);
        if (groceryEntity!=null){
            groceryEntity.setName(grocery.getName());
            groceryEntity.setBucket(grocery.getBucket());
            groceryEntity.setPrice(grocery.getPrice());
            return groceryDao.save(groceryEntity);
        }
        return null;
    }

    @Override
    public void deleteGrocery(Integer groceryId) {
        groceryDao.deleteById(groceryId);
    }
}
