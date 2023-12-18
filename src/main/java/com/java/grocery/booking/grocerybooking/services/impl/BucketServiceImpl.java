package com.java.grocery.booking.grocerybooking.services.impl;

import com.java.grocery.booking.grocerybooking.dao.BucketDao;
import com.java.grocery.booking.grocerybooking.entity.BucketEntity;
import com.java.grocery.booking.grocerybooking.services.BucketService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class BucketServiceImpl implements BucketService {
    private final BucketDao bucketDao;

    @Override
    public List<BucketEntity> getAllBuckets() {
        return bucketDao.findAll();
    }

    @Override
    public BucketEntity getBugetBucketById(Integer bucketId) {
        return bucketDao.findById(bucketId).orElse(null);
    }

    @Override
    public BucketEntity addBucket(BucketEntity bucket) {
        return bucketDao.save(bucket);
    }

    @Override
    public BucketEntity updateBucket(Integer bucketId, BucketEntity bucket) {
        BucketEntity bucketEntity = bucketDao.findById(bucketId).orElse(null);
        if(bucketEntity!=null){
            bucketEntity.setUser(bucket.getUser());
            bucketEntity.setCollections(bucket.getCollections());
            return bucketDao.save(bucketEntity);
        }
        return null;
    }

    @Override
    public void deleteBucket(Integer bucketId) {
        bucketDao.deleteById(bucketId);
    }

    @Override
    public BucketEntity addGroceryItemToList(Integer bucket_id, ArrayList<String> items) {
//        BucketEntity bucketEntity = bucketDao.findById(bucket_id).orElse(null);
//        if(bucketEntity!=null){
//            bucketEntity.
//        }
//        return bucketDao.;
        return null;
    }
}
