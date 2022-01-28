package com.example.prueba.controller;

import com.example.prueba.model.User;
import com.example.prueba.services.interfaz.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value={"/get", "/get/{name}"})
    public @ResponseBody
    List<User> get(@PathVariable(required = false) String name) {
        return userService.get(name);
    }

}
