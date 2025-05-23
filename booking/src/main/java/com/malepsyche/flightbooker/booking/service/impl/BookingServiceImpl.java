package com.malepsyche.flightbooker.booking.service.impl;

import com.malepsyche.flightbooker.booking.dto.BookingDetailDTO;
import com.malepsyche.flightbooker.booking.dto.CreateBookingDTO;
import com.malepsyche.flightbooker.booking.mapper.BookingMapper;
import com.malepsyche.flightbooker.booking.service.IBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingServiceImpl implements IBookingService {
    private BookingMapper bookingMapper;

    @Autowired
    public BookingServiceImpl(BookingMapper bookingMapper) {
        this.bookingMapper = bookingMapper;
    }

    @Override
    public void createBooking(CreateBookingDTO createBookingDTO) {
        bookingMapper.createBooking(createBookingDTO);
    }

    @Override
    public BookingDetailDTO getBookingById(String bookingId) {
        return bookingMapper.getBookingById(bookingId);
    }
}
