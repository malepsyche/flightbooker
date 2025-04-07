package com.malepsyche.flightbooker.booking.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("booking_table")
public class CreateBookingDTO {
    private String userId;
}
