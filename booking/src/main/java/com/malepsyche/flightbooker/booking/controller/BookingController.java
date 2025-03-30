package com.malepsyche.flightbooker.booking.controller;

import com.malepsyche.flightbooker.booking.service.IBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/booking")
public class BookingController {
    private IBookingService bookingService;

    @Autowired
    public BookingController(IBookingService bookingService) {
        this.bookingService = bookingService;
    }
}
