package com.kaveri.CarRentalsApp.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;
@Entity
@Table(name ="bookinglist")
@Data
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookingId;
    //  @OneToOne
    //  @JoinColumn(name = "order_id", referencedColumnName = "order_id")
    @OneToOne
    private Car car;
    @OneToOne
    private User user;
    @Column
    private int days;
}
