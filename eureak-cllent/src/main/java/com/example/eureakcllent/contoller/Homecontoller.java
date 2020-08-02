package com.example.eureakcllent.contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontoller {
    @RequestMapping("/")
    public String home(){
        return "we1";
    }
}
