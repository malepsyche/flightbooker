package com.malepsyche.flightbooker.booking.service;

import com.malepsyche.flightbooker.booking.dto.BookingDetailDTO;
import com.malepsyche.flightbooker.booking.dto.CreateBookingDTO;

public interface IBookingService {
    public void createBooking(CreateBookingDTO dto);
    public BookingDetailDTO getBookingById(String bookingId);
}
