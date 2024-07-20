package com.kaveri.CarRentalsApp.services;

import com.kaveri.CarRentalsApp.model.Booking;

public interface BookingService {
    public String bookedCar(Booking booking);
    public  String returnCar(Booking booking);
}
