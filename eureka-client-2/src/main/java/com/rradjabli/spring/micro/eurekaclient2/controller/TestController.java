package com.rradjabli.spring.micro.eurekaclient2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main2")
public class TestController {
    @GetMapping("/test2")
    public String response(){
        return "Testing Second Controller";
    }
}
