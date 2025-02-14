package com.wealth.wealthnotification.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@Configuration
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class GreetingsController {

    int i = 1;

    @GetMapping("/greetings")
    private String getGreetings() {

        String result = "";

        if (i==1) {
            result = "All the very best";
            i = 2 ;
        } else if (i==2) {
            result = "Wish you good luck";
            i = 3 ;
        } else if (i==3) {
            result = "Have a nice time";
            i = 1;
        }
        return result;
    }
}