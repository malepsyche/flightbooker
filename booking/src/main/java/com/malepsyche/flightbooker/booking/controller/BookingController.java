package com.malepsyche.flightbooker.booking.controller;

import com.malepsyche.flightbooker.booking.dto.BookingDetailDTO;
import com.malepsyche.flightbooker.booking.dto.CreateBookingDTO;
import com.malepsyche.flightbooker.booking.service.IBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/booking")
public class BookingController {
    public IBookingService bookingService;

    @Autowired
    public BookingController(IBookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping("/createBooking")
    public void createBooking(CreateBookingDTO createBookingDTO) {
        bookingService.createBooking(createBookingDTO);
    }

    @GetMapping("/getBookingById/{bookingId}")
    public BookingDetailDTO getBookingById(@PathVariable String bookingId) {
        return bookingService.getBookingById(bookingId);
    }
}
