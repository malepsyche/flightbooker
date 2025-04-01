package com.malepsyche.flightbooker.user.entity;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.Version;
import lombok.Data;

@Data
@TableName("user_table")
public class User {
    private int userId;
    private String userName;
    @Version
    private int version;
}
