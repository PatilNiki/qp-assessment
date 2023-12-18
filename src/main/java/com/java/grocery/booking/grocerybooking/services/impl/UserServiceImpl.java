package com.java.grocery.booking.grocerybooking.services.impl;

import com.java.grocery.booking.grocerybooking.dao.UserDao;
import com.java.grocery.booking.grocerybooking.entity.UserEntity;
import com.java.grocery.booking.grocerybooking.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserDao userDao;

    @Override
    public List<UserEntity> getAllUsers() {
        return userDao.findAll();
    }

    @Override
    public UserEntity getUserById(Integer id) {
        return userDao.findById(id).orElse(null);

    }

    @Override
    public UserEntity addUser(UserEntity user) {
        return userDao.save(user);
    }

    @Override
    public UserEntity updateUser(UserEntity user) {
        UserEntity userEntity = userDao.findById(user.getId()).orElse(null);
        if(userEntity != null) {
            userEntity.setFirstName(user.getFirstName());
            userEntity.setLastName(user.getLastName());
            userEntity.setRole(user.getRole());
            return userDao.save(userEntity);
        }
        else
            return null;

    }

    @Override
    public void deleteUser(Integer userId) {

        userDao.deleteById(userId);
    }

//    @Override
//    public UserEntity updateUserRole(Integer userId, String role) {
//        UserEntity userEntity = userDao.findById(userId).orElse(null);
//        return userDao.
//    }
}
