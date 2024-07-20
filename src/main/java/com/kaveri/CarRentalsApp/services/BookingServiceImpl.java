package com.kaveri.CarRentalsApp.services;

import com.kaveri.CarRentalsApp.model.Booking;
import com.kaveri.CarRentalsApp.repository.BookingRepository;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceImpl implements BookingService{

    private BookingRepository bookingRepository;
    @Override
    public String bookedCar(Booking booking) {

        return null;
    }

    @Override
    public String returnCar(Booking booking) {
        return null;
    }
}
