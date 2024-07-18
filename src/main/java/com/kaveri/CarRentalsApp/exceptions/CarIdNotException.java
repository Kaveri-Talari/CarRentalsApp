package com.kaveri.CarRentalsApp.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CarIdNotException extends RuntimeException {
    public CarIdNotException(String id){
        super(id);
    }

}
