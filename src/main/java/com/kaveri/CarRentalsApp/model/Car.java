package com.kaveri.CarRentalsApp.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="car")
@Data
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer carId;

    @Column
    private String carName;

    @Column
    private String status;

    @Column
    private String carLocation;

    @Column
    private String carType;

    @Column
    private Integer carRentalPrice;

}
