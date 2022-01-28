package com.example.prueba.repository;

import com.example.prueba.model.UserDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserDTO, Long> {

    List<UserDTO> findByNameLike(String name);

}
