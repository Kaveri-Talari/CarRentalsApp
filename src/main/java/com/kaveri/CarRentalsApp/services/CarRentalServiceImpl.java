package com.kaveri.CarRentalsApp.services;

import com.kaveri.CarRentalsApp.exceptions.CarIdNotException;
import com.kaveri.CarRentalsApp.model.Booking;
import com.kaveri.CarRentalsApp.model.Car;
import com.kaveri.CarRentalsApp.model.User;
import com.kaveri.CarRentalsApp.repository.BookingRepository;
import com.kaveri.CarRentalsApp.repository.CarRepository;
import com.kaveri.CarRentalsApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class CarRentalServiceImpl implements CarRentalService{
    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CarRepository carRepository;

    @Override
    public String addCar(Car car) {
        carRepository.save(car);
        return "Success";
    }
    @Override
    public void bookedCar(Integer carId) {

    }
    @Override
    public Car getById( Integer carId) {
       return carRepository.findById(carId).
                orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Car not found with id " + carId));
    }
    @Override
    public List<Car> carslist(String userLocation) {
        List<Car> cars = carRepository.findByCarLocation(userLocation);
        return cars;
    }

    @Override
    public Car deleteCarById(Integer carId) {
        Optional<Car> findById = carRepository.findById(carId);
        return findById.get();
    }
   /* public Booking booking(Integer cid){
        Optional<Car> findById = carRepository.findById(cid);
       /* if(findById.isPresent()) {
           int amount= findById.get(car);
        }
        return null;
    }*/

}
