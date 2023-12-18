package com.java.grocery.booking.grocerybooking.dao;

import com.java.grocery.booking.grocerybooking.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<UserEntity, Integer> {
}
