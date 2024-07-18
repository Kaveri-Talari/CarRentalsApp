package com.kaveri.CarRentalsApp.controller;

import com.kaveri.CarRentalsApp.exceptions.UserNotFound;
import com.kaveri.CarRentalsApp.model.User;
import com.kaveri.CarRentalsApp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public ResponseEntity<String> creationUser(@RequestBody User user) {
        String status;
        status =userService.addUsers(user);
        return new ResponseEntity<>(status, HttpStatus.CREATED);
    }

    @GetMapping("/users/{userId}")
    public ResponseEntity<User> getByUserId(@PathVariable Integer userId) {
        try {
            User user = userService.getByUserId(userId);
            return new ResponseEntity<>(user, HttpStatus.OK);
        }
        catch(UserNotFound userNotFound){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
