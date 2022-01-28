package com.example.prueba.controller;

import com.example.prueba.model.UserDTO;
import com.example.prueba.services.interfaz.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value={"/user", "/user/{name}"})
    public @ResponseBody
    ResponseEntity<List<UserDTO>> get(@PathVariable(required = false) String name) {
        return new ResponseEntity<>(userService.get(name), HttpStatus.OK);
    }

    @PostMapping("user")
    public ResponseEntity<UserDTO> save(@RequestBody UserDTO user){
        return new ResponseEntity<>(userService.save(user), HttpStatus.CREATED);
    }

    @PutMapping("user")
    public ResponseEntity<UserDTO> update(@RequestBody UserDTO user){
        return new ResponseEntity<>(userService.update(user), HttpStatus.OK);
    }

    @DeleteMapping("/user/{idUser}")
    public ResponseEntity<Long> delete(@PathVariable Long idUser){
        userService.delete(idUser);
        return new ResponseEntity<>(idUser, HttpStatus.OK);
    }

}
