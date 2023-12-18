package com.java.grocery.booking.grocerybooking.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Entity
@AllArgsConstructor
@Data
public class CollectionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer id;

    @Column
    @NonNull
    @JoinColumn(name = "ref_grocery")
    @JsonManagedReference
    private GroceryEntity grocery;

    @Column
    @NonNull
    @JoinColumn(name="ref_bucket")
    @ManyToOne
    @JsonManagedReference
    private BucketEntity bucket;


}
