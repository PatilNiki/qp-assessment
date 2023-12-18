package com.java.grocery.booking.grocerybooking.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import org.apache.catalina.User;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
public class BucketEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Integer id;

    @Column
    @JoinColumn(name = "ref_user")
    @NonNull
    private UserEntity user;

    @Column
    @JoinColumn(name = "ref_collection")
    @NonNull
    @JsonManagedReference
    @OneToMany(mappedBy = "bucket")
    private List<CollectionEntity> collections= new ArrayList<>();

}
