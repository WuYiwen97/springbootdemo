package com.wuyiwen.springbootdemo.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpring {

    @RequestMapping("/testSpring")
    public String test(){
        return "hello";
    }

}
