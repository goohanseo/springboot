package com.example.springboot.config.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class HelloController {

    //@RequestMapping(value = "/hello",method  = RequestMethod.GET)
    @GetMapping("hello")
    public String hello(){
        return "Hello world";
    }
}
