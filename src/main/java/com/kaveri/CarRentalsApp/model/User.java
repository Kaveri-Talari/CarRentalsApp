package com.kaveri.CarRentalsApp.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Entity
@Table(name = "user")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer userId;
    @Column
    private String userName;
    @Column
    private String userLocation;
    @Column
    private String userEmail;
    @Column
    private Integer userAge;


}
