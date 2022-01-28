package com.example.prueba.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long idRol;
    private String name;
    private boolean active;

    public Long getId() {
        return id;
    }

    public Long getIdRol() {
        return idRol;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return active;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIdRol(Long idRol) {
        this.idRol = idRol;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
