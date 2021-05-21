package com.wuyiwen.springbootdemo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.Map;

@Controller
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "test";
    }

    @RequestMapping("/test1")
    public String test1(Model model){
        model.addAttribute("msg","hello , thymeleaf");
        return "test1";
    }

    @RequestMapping("/t2")
    public String test2(Map<String,Object> map){
        //存入数据
        map.put("msg","ddafas");
        map.put("users", Arrays.asList("qinjiang","kuangshen"));
        //classpath:/templates/test.html
        return "test1";
    }



}
