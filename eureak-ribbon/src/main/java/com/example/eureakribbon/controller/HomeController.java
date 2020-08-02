package com.example.eureakribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController //不跳转
public class HomeController {
    @Autowired
    private RestTemplate restTemplate;  //手动装配的bean

    @RequestMapping("/ribbon")   //
    public String helloConsumer(){
        return restTemplate.getForEntity("http://EUREKA-CLIENT/",String.class).getBody();
    }
}
