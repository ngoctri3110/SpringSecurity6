package com.example.springsecuritybasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("controller")
public class Section1Application {

    public static void main(String[] args) {
        SpringApplication.run(Section1Application.class, args);
    }

}
