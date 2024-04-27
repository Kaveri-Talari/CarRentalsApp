package com.kaveri.CarRentalsApp.controller;

import com.kaveri.CarRentalsApp.model.Booking;
import com.kaveri.CarRentalsApp.model.Car;
import com.kaveri.CarRentalsApp.model.User;
import com.kaveri.CarRentalsApp.repository.CarRepository;
import com.kaveri.CarRentalsApp.services.CarRentalService;
import com.kaveri.CarRentalsApp.services.CarRentalServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CarRentalController {

    @Autowired
    private CarRentalService carRentalService;
    @Autowired
    private CarRepository carRepository;

    @PostMapping("/car")
    public ResponseEntity<String> creationCar(@RequestBody Car car) {
        String status;
        status = carRentalService.addCar(car);
        return new ResponseEntity<>(status, HttpStatus.CREATED);
    }

    @PostMapping("/user")
    public ResponseEntity<String> creationUser(@RequestBody User user) {
        String status;
        status = carRentalService.addUser(user);
        return new ResponseEntity<>(status, HttpStatus.CREATED);

    }
    @GetMapping("/cars/{carId}")
    public Car getById(@PathVariable Integer carId) {
        Car car=carRentalService.getById(carId);
        return new ResponseEntity<>(car,HttpStatus.OK).getBody();
    }
   @GetMapping("/carlocation/{userLocation}")
    public List<Car> getById(@PathVariable String userLocation) {
        List<Car> carList=carRentalService.carslist(userLocation);
        return new ResponseEntity<>(carList,HttpStatus.OK).getBody();
    }

    public void bookedCar(Integer carId) {

    }

}
