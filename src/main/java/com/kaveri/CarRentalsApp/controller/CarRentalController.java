package com.kaveri.CarRentalsApp.controller;

import com.kaveri.CarRentalsApp.exceptions.CarIdNotException;
import com.kaveri.CarRentalsApp.exceptions.UserNotFound;
import com.kaveri.CarRentalsApp.model.Booking;
import com.kaveri.CarRentalsApp.model.Car;
import com.kaveri.CarRentalsApp.model.User;
import com.kaveri.CarRentalsApp.repository.CarRepository;
import com.kaveri.CarRentalsApp.services.CarRentalService;
import com.kaveri.CarRentalsApp.services.CarRentalServiceImpl;
import com.kaveri.CarRentalsApp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@RestController
public class CarRentalController {



}
