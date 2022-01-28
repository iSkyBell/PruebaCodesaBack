package com.example.prueba.services;

import com.example.prueba.model.User;
import com.example.prueba.repository.UserRepository;
import com.example.prueba.services.interfaz.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServicesImpl implements UserService {

    private static final String PORCENTAJE = "%";
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> get(String name) {
        List<User> userList;
        if(name == null || name.isEmpty()) {
            userList = userRepository.findAll();
        } else {
            userList = userRepository.findByNameLike(PORCENTAJE.concat(name).concat(PORCENTAJE));
        }

        return userList;
    }
}
