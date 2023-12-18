package com.java.grocery.booking.grocerybooking.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor
@Entity
public class GroceryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer id;

    @Column
    @NonNull
    private String name;

    @Column
    @NonNull
    private float price;

    @NonNull
    @ManyToOne
    private BucketEntity bucket;

}
