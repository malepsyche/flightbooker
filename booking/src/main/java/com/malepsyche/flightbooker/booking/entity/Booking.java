package com.malepsyche.flightbooker.booking.entity;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Booking {
    private int bookingId;
    private LocalDateTime bookingTime;
    private int userId;
}

