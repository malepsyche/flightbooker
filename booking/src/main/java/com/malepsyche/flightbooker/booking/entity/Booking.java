package com.malepsyche.flightbooker.booking.entity;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;

import java.time.Instant;

@Data
public class Booking {
    private String bookingId;
    private Instant bookingTime;
    private int userId;
    @Version
    int version;
}

