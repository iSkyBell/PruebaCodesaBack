package com.example.prueba.services.interfaz;

import com.example.prueba.model.User;

import java.util.List;

public interface UserService {

    List<User> get(String name);

}
