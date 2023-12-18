package com.java.grocery.booking.grocerybooking.controller;

import com.java.grocery.booking.grocerybooking.entity.UserEntity;
import com.java.grocery.booking.grocerybooking.services.UserService;
import lombok.AllArgsConstructor;
import lombok.Delegate;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/user")
public class UserController {

    private final UserService userService;

    @GetMapping
    public List<UserEntity> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping(value = "/{user_id}")
    public UserEntity getUserById(@PathVariable Integer user_id){
        return userService.getUserById(user_id);
    }

    @PostMapping
    public UserEntity addUser(@RequestBody UserEntity user){
        return userService.addUser(user);
    }

    @PutMapping(value = "/{user_id}")
    public UserEntity updateUser(@PathVariable Integer user_id, @RequestBody UserEntity user){
        return userService.updateUser(user);
    }

    @PatchMapping(value = "/{user_id}")
    public UserEntity updateUserRole(@PathVariable Integer user_id, @RequestBody String role){
        return userService.updateUserRole(user_id,role);
    }

    @DeleteMapping(value="/{user_id}")
    public void deleteUser(@PathVariable Integer user_id){
        userService.deleteUser(user_id);
    }
}
