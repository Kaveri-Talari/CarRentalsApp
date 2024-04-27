package com.kaveri.CarRentalsApp.repository;

import com.kaveri.CarRentalsApp.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car,Integer> {
    List<Car> findByCarLocation(String carLocation);
}
