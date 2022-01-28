package com.example.prueba.services;

import com.example.prueba.model.UserDTO;
import com.example.prueba.repository.UserRepository;
import com.example.prueba.services.interfaz.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServicesImpl implements UserService {

    private static final String PORCENTAJE = "%";
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<UserDTO> get(String name) {
        List<UserDTO> userDTOList;
        if(name == null || name.isEmpty()) {
            userDTOList = userRepository.findAll();
        } else {
            userDTOList = userRepository.findByNameLike(PORCENTAJE.concat(name).concat(PORCENTAJE));
        }

        return userDTOList;
    }

    @Override
    public UserDTO save(UserDTO user) {
        Long id = userRepository.save(user).getId();
        user.setId(id);
        return user;
    }

    @Override
    public UserDTO update(UserDTO user) {
        UserDTO userUpdate = null;
        Optional<UserDTO> userFind = userRepository.findById(user.getId());
        if(userFind.isPresent()) {
            userFind.get().setActive(user.isActive());
            userUpdate = userRepository.save(userFind.get());
        }
        return userUpdate;
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
