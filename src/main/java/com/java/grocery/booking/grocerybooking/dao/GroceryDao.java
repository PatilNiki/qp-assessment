package com.java.grocery.booking.grocerybooking.dao;

import com.java.grocery.booking.grocerybooking.entity.GroceryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroceryDao extends JpaRepository<GroceryEntity, Integer> {
}
