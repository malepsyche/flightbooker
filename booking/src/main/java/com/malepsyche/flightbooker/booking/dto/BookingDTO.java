package com.malepsyche.flightbooker.booking.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("booking_table")
public class BookingDTO {
    private LocalDateTime bookingTime;
    private int userId;
}
