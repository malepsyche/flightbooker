package org.example.flightbooker;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("org.example.flightbooker.mapper")
public class FlightBooker {

    public static void main(String[] args) {
        SpringApplication.run(FlightBooker.class, args);
    }

}
