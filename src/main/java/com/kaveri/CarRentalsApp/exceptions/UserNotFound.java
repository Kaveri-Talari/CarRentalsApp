package com.kaveri.CarRentalsApp.exceptions;

import com.kaveri.CarRentalsApp.model.User;
import com.kaveri.CarRentalsApp.repository.UserRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.yaml.snakeyaml.tokens.ScalarToken;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFound extends RuntimeException{
    public UserNotFound(String message) {
        super(message);
    }
}
