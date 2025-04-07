package com.malepsyche.flightbooker.booking.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.malepsyche.flightbooker.booking.dto.BookingDetailDTO;
import com.malepsyche.flightbooker.booking.dto.CreateBookingDTO;
import com.malepsyche.flightbooker.booking.mapper.BookingMapper;
import com.malepsyche.flightbooker.booking.service.IBookingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import java.time.Instant;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

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

    @Test
    public void testCreateBooking() throws Exception {
        String userId = "11f00f0c-e6a5-12ec-9ec9-0242ac150002";
        CreateBookingDTO createBookingDTO = new CreateBookingDTO();
        createBookingDTO.setUserId(userId);
        mockMvc.perform(post("/booking/createBooking")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(objectMapper.writeValueAsString(createBookingDTO)))
                .andExpect(status().isOk());
    }

    @Test
    public void testGetBookingById() throws Exception {
        String bookingId = "11f00f0c-e6a5-12ec-9ec9-0242ac150002";
        Instant bookingTime = Instant.parse("2023-04-01T12:34:56Z");  // A fixed instant for testing
        int version = 1;
        String userId = "11f00f0c-e6a5-12ec-9ec9-0242ac150002";
        BookingDetailDTO bookingDetailDTO = new BookingDetailDTO();
        bookingDetailDTO.setBookingTime(bookingTime);
        bookingDetailDTO.setVersion(version);
        bookingDetailDTO.setUserId(userId);
        when(bookingService.getBookingById(bookingId)).thenReturn(bookingDetailDTO);
        mockMvc.perform(get("/booking/getBookingById/" + bookingId))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.bookingTime").value(bookingTime.toString()))
                .andExpect(jsonPath("$.version").value(version))
                .andExpect(jsonPath("$.userId").value(userId));
    }

}
