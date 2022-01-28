package com.example.prueba.model;

import javax.persistence.*;

@Entity
@Table(name="usuario")
public class UserDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_usuario")
    private Long id;
    @Column(name = "id_rol")
    private Long idRol;
    @Column(name = "nombre")
    private String name;
    @Column(name = "activo")
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
