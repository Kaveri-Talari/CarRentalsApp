package com.kaveri.CarRentalsApp.services;

import com.kaveri.CarRentalsApp.model.Car;
import com.kaveri.CarRentalsApp.model.User;
import com.kaveri.CarRentalsApp.repository.BookingRepository;
import com.kaveri.CarRentalsApp.repository.CarRepository;
import com.kaveri.CarRentalsApp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public String addUser(User user) {
        userRepository.save(user);
        return  "Success";

    }
    @Override
    public void bookedCar(Integer carId) {

    }
    @Override
    public Car getById(Integer cid) {
        Optional<Car> findById = carRepository.findById(cid);
        if(findById.isPresent()) {
            return findById.get();
        }
        return null;
    }

    @Override
    public List<Car> carslist(String userLocation) {
        List<Car> cars = carRepository.findByCarLocation(userLocation);
        return cars;
    }

}
