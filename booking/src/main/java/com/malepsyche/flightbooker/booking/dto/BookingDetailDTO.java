package com.malepsyche.flightbooker.booking.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;

import java.time.Instant;

@Data
@TableName("booking_table")
public class BookingDetailDTO {
    private Instant bookingTime;
    @Version
    private int version;
    private String userId;
}
