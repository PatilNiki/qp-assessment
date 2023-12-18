package com.java.grocery.booking.grocerybooking.controller;

import com.java.grocery.booking.grocerybooking.entity.GroceryEntity;
import com.java.grocery.booking.grocerybooking.services.GroceryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/grocery")
@AllArgsConstructor
public class GroceryController {

    private final GroceryService groceryService;

    @GetMapping
    public List<GroceryEntity> getAllGrocery(){
        return groceryService.getAllGrocery();
    }

    @GetMapping(value = "/{grocery_id}")
    public GroceryEntity getGroceryById(@PathVariable Integer grocery_id){
        return groceryService.getGroceryById(grocery_id);
    }

    @PostMapping
    public GroceryEntity addGrocery(@RequestBody GroceryEntity grocery){
        return groceryService.addGrocery(grocery);
    }

    @PutMapping(value = "/{grocery_id}")
    public GroceryEntity UpdateGrocery(@PathVariable Integer grocery_id, @RequestBody GroceryEntity grocery ){
        return groceryService.updateGrocery(grocery_id, grocery);
    }

    @DeleteMapping(value = "/{grocery_id}")
    public void deleteUser(@PathVariable Integer grocery_id){
        groceryService.deleteGrocery(grocery_id);
    }

}
