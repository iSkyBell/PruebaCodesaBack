package com.example.prueba.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("api-test")
public class Greeting {

    @GetMapping("/greeting")
    public @ResponseBody String greeting(){
        return "Hello world!";
    }

}
