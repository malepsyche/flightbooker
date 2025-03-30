package com.malepsyche.flightbooker.bookingservice.service.impl;

import com.malepsyche.flightbooker.bookingservice.mapper.BookingMapper;
import com.malepsyche.flightbooker.bookingservice.service.IBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceImpl implements IBookingService {
    private BookingMapper bookingMapper;

    @Autowired
    public BookingServiceImpl(BookingMapper bookingMapper) {
        this.bookingMapper = bookingMapper;
    }
}
