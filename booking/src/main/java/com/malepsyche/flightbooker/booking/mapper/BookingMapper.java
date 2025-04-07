package com.malepsyche.flightbooker.booking.mapper;

import com.malepsyche.flightbooker.booking.dto.BookingDetailDTO;
import com.malepsyche.flightbooker.booking.dto.CreateBookingDTO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BookingMapper {
    public void createBooking(CreateBookingDTO createBookingDTO);
    public BookingDetailDTO getBookingById(String bookingId);
}
