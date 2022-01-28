package com.example.prueba.services;

import com.example.prueba.mock.UserDataMock;
import com.example.prueba.model.UserDTO;
import com.example.prueba.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserServicesImplTest {

    @Mock
    UserRepository userRepositoryMock;

    @InjectMocks
    private UserServicesImpl userServicesImpl;

    List<UserDTO> listUser;
    List<UserDTO> listUserFail;

    @BeforeEach
    public void init() {
        listUser = new UserDataMock().getData();
        listUserFail = new UserDataMock().getDataFail();
    }

    @Test
    void getSuccess() {
        // init
        when(userRepositoryMock.findByNameLike(any(String.class))).thenReturn(listUser);

        //act
        List<UserDTO> response = userServicesImpl.get("test");

        //assert
        assertSame(listUser.get(0), response.get(0));
    }

    @Test
    void getNotEquals() {
        // init
        when(userRepositoryMock.findByNameLike(any(String.class))).thenReturn(listUser);

        //act
        List<UserDTO> response = userServicesImpl.get("test");

        //assert
        assertNotEquals(listUserFail.get(0), response.get(0));
    }

    @Test
    void saveSuccess() {
        // init
        when(userRepositoryMock.save(any(UserDTO.class))).thenReturn(listUser.get(0));

        // act
        UserDTO response = userServicesImpl.save(listUser.get(0));

        // assert
        assertEquals(response.getId(), listUser.get(0).getId());
    }

    @Test
    void saveNotSuccess() {
        // init
        when(userRepositoryMock.save(any(UserDTO.class))).thenReturn(listUser.get(0));

        // act
        UserDTO response = userServicesImpl.save(listUser.get(0));

        // assert
        assertNotEquals(response.getId(), listUserFail.get(0).getId());
    }

    @Test
    void updateSuccess() {
        // init
        when(userRepositoryMock.findById(anyLong())).thenReturn(Optional.ofNullable(listUser.get(0)));
        when(userRepositoryMock.save(any(UserDTO.class))).thenReturn(listUser.get(0));

        // act
        UserDTO response = userServicesImpl.update(listUser.get(0));

        // assert
        assertEquals(listUser.get(0), response);
    }
}