package com.kaveri.CarRentalsApp.services;

import com.kaveri.CarRentalsApp.model.Car;
import com.kaveri.CarRentalsApp.model.User;
import com.kaveri.CarRentalsApp.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;
    @Override
    public String addUsers(User user) {
        userRepository.save(user);
        return "SaveUser";
    }
    @Override
    public User getByUserId(Integer userId) {
        return userRepository.findById(userId).
                orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, "Car not found with id " + userId));
    }
}
