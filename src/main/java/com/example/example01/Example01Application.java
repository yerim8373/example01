package com.example.example01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class Example01Application {

    @GetMapping("/hello")
    public String hello(){
        return "Hello Spring Boot";
    }
    public static void main(String[] args) {
        SpringApplication.run(Example01Application.class, args);
    }

}
