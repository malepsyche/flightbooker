package org.example.flightbooker.dto;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("user_table")
public class UserDTO {
    private String userName;
}
