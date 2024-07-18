package com.kaveri.CarRentalsApp.controller;

import com.kaveri.CarRentalsApp.exceptions.CarIdNotException;
import com.kaveri.CarRentalsApp.model.Car;
import com.kaveri.CarRentalsApp.services.CarRentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class CarController {
    @Autowired
    private CarRentalService carRentalService;
    @PostMapping("/car")
    public ResponseEntity<String> creationCar(@RequestBody Car car) {
        String status;
        status = carRentalService.addCar(car);
        return new ResponseEntity<>(status, HttpStatus.CREATED);
    }

    @GetMapping("/cars/{carId}")
    public ResponseEntity<Car> getById(@PathVariable Integer carId) {
        try {
            Car car = carRentalService.getById(carId);
            return new ResponseEntity<>(car,HttpStatus.OK);
        }
        catch(CarIdNotException c){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @GetMapping("/carlocation/{userLocation}")
    public ResponseEntity<List<Car>> getById(@PathVariable String userLocation) {
        List<Car> carList=carRentalService.carslist(userLocation);
        return new ResponseEntity<>(carList,HttpStatus.OK);
    }
    @GetMapping("/bookedcar/{carId}")
    public ResponseEntity<Car> bookedCar(@PathVariable Integer carId) {
        Car car=carRentalService.getById(carId);
        return new ResponseEntity<>(car,HttpStatus.OK);
    }
    @DeleteMapping("/deletecar/{carId}")
    public String deleteCar(@PathVariable Integer carId) {
        try {
            Car car = carRentalService.getById(carId);
            return "Success";
        }
        catch (CarIdNotException c){
            return "CarNotFound";
        }
    }
}
