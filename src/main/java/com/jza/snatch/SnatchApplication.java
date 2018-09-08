package com.jza.snatch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication()
public class SnatchApplication {

    public static void main(String[] args) {
        SpringApplication.run(SnatchApplication.class, args);
    }
}
