package com.decathlon.calculator;

import com.decathlon.calculator.config.SportProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(SportProperties.class)
public class PointCalculatorApplication {

    public static void main(String[] args) {
        SpringApplication.run(PointCalculatorApplication.class, args);
    }
}
