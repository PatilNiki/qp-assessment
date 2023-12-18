package com.java.grocery.booking.grocerybooking.services;

import com.java.grocery.booking.grocerybooking.entity.BucketEntity;

import java.util.ArrayList;
import java.util.List;

public interface BucketService {
    List<BucketEntity> getAllBuckets();

    BucketEntity getBugetBucketById(Integer bucketId);

    BucketEntity addBucket(BucketEntity bucket);

    BucketEntity updateBucket(Integer bucketId, BucketEntity bucket);

    void deleteBucket(Integer bucketId);

    BucketEntity addGroceryItemToList(Integer bucketId, ArrayList<String> items);
}
