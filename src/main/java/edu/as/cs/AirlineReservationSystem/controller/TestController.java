package edu.as.cs.AirlineReservationSystem.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test/api")
public class TestController {
    @GetMapping("/hello")
    private String sayHello() {
        return "Hello Ashok";
    }
}
