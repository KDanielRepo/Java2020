package com.pkisi.kucd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.pkisi.kucd"})
public class Java2020Application {
    public static void main(String[] args) {
        SpringApplication.run(Java2020Application.class,args);
    }
}
