package com.java.grocery.booking.grocerybooking.services;

import com.java.grocery.booking.grocerybooking.dao.UserDao;
import com.java.grocery.booking.grocerybooking.entity.UserEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


public interface UserService {
    public List<UserEntity> getAllUsers();
    public UserEntity getUserById(Integer id);

    public UserEntity addUser(UserEntity user);
    public UserEntity updateUser(UserEntity user);

    void deleteUser(Integer userId);

    UserEntity updateUserRole(Integer userId, String role);
}
