package com.neil.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HellowSpringBoot {
    @RequestMapping("info")
    public String info(){
        return "hello Spring";
    }
}
