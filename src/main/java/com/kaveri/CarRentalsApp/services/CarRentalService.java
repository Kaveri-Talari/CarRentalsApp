package com.kaveri.CarRentalsApp.services;

import com.kaveri.CarRentalsApp.model.Car;
import com.kaveri.CarRentalsApp.model.User;

import java.util.List;

public interface CarRentalService {
    public  String addCar(Car car);

    public  String addUser(User user);

    public void bookedCar(Integer carId);

    public Car getById(Integer carId);

    public List<Car> carslist(String userLocation);


}
