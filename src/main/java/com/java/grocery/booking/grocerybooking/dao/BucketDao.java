package com.java.grocery.booking.grocerybooking.dao;

import com.java.grocery.booking.grocerybooking.entity.BucketEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BucketDao extends JpaRepository<BucketEntity, Integer> {
}
