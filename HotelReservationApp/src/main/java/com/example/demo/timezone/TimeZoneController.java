package com.example.demo.timezone;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/time")
public class TimeZoneController {
    @GetMapping("/zones")
    public String getTimeZones() {
        return TimeZoneHandler.handleTimeZones();
    }
}
