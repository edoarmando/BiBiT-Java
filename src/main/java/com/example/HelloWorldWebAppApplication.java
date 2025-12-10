package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class HelloWorldWebAppApplication {
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldWebAppApplication.class, args);
    }
}

@RestController
class HelloWorldController {

    @GetMapping("/hello")
    public String hello() {
        return "<div style='text-align: center;'>" +
               "<h1>Hello World V3.0!</h1>" +
               "<h2>DEMO SPRING MAVEN BiBiT BSI</h2>" +
               "</div>";
    }
}
