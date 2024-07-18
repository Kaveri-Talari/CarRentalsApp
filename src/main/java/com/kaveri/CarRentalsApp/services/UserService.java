package com.kaveri.CarRentalsApp.services;

import com.kaveri.CarRentalsApp.model.User;
import com.kaveri.CarRentalsApp.repository.UserRepository;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.stereotype.Service;

public interface UserService{
    public String addUsers(User user);
    public User getByUserId(Integer userId);
}
