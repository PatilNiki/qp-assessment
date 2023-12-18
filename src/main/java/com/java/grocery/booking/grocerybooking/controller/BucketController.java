package com.java.grocery.booking.grocerybooking.controller;

import com.java.grocery.booking.grocerybooking.entity.BucketEntity;
import com.java.grocery.booking.grocerybooking.services.BucketService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/{bucket}")
public class BucketController {
    private final BucketService bucketService;

    @GetMapping
    public List<BucketEntity> getAllBuckets(){
        return bucketService.getAllBuckets();
    }

    @GetMapping(value = "/{bucket_id}")
    public BucketEntity getBucketById(@PathVariable Integer bucket_id){
        return bucketService.getBugetBucketById(bucket_id);
    }

    @PostMapping
    public BucketEntity addBucket(@RequestBody BucketEntity bucket){
        return bucketService.addBucket(bucket);
    }

    @PutMapping(value = "/{bucket_id}")
    public BucketEntity updateBucket(@PathVariable Integer bucket_id, @RequestBody BucketEntity bucket){
        return bucketService.updateBucket(bucket_id, bucket);
    }

    @DeleteMapping(value = "/{bucket_id}")
    public void deleteBucket(@PathVariable Integer bucket_id){
        bucketService.deleteBucket(bucket_id);
    }

    @PatchMapping(value = "/{bucket_id}")
    public BucketEntity addGroceryItemsToList(@PathVariable Integer bucket_id, @RequestBody ArrayList<String> items){
        return bucketService.addGroceryItemToList(bucket_id, items);
    }


}
