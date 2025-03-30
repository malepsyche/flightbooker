package com.malepsyche.flightbooker.bookingservice.entity;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Booking {
    private int bookingId;
    private LocalDateTime bookingTime;
    private Boolean bookingStatus;
    private int userId;
    private int paymentId;
}

