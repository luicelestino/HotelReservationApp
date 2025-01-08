package com.example.demo.translation;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/welcome")
public class WelcomeController {
    @GetMapping("/messages")
    public String[] getWelcomeMessages() {
        return WelcomeMsgHandler.handleMessages();
    }
}