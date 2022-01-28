package com.example.prueba.services.interfaz;

import com.example.prueba.model.UserDTO;

import java.util.List;

public interface UserService {

    List<UserDTO> get(String name);

    UserDTO save(UserDTO user);

    UserDTO update(UserDTO user);

    void delete(Long id);

}
