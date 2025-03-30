package com.malepsyche.flightbooker.bookingservice.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@TableName("booking_table")
public class BookingDTO {
    private LocalDateTime bookingTime;
    private Boolean bookingStatus;
    private int userId;
    private int paymentId;
}
