package com.example.prueba.mock;

import com.example.prueba.model.UserDTO;

import java.util.ArrayList;
import java.util.List;

public class UserDataMock {

    public List<UserDTO> getData() {
        List<UserDTO> listUser = new ArrayList<>();
        UserDTO userDTO = new UserDTO();
        userDTO.setId(1L);
        userDTO.setIdRol(1L);
        userDTO.setName("Test");
        userDTO.setActive(true);
        listUser.add(userDTO);
        return listUser;
    }

    public List<UserDTO> getDataFail() {
        List<UserDTO> listUser = new ArrayList<>();
        UserDTO userDTO = new UserDTO();
        userDTO.setId(2L);
        userDTO.setIdRol(2L);
        userDTO.setName("Test");
        userDTO.setActive(false);
        listUser.add(userDTO);
        return listUser;
    }
}
