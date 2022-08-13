package com.example.jenkinssample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/ming")
    public String hello() {
        return "mink OK";
    }
}
