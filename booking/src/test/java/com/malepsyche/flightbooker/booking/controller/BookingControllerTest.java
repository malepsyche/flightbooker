package com.malepsyche.flightbooker.booking.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.malepsyche.flightbooker.booking.mapper.BookingMapper;
import com.malepsyche.flightbooker.booking.service.IBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(BookingController.class)
public class BookingControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockitoBean
    private IBookingService bookingService;

    @MockitoBean
    private BookingMapper bookingMapper;

    @Autowired
    private ObjectMapper objectMapper;

}
