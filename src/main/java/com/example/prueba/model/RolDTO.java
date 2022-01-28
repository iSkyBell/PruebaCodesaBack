package com.example.prueba.model;

import javax.persistence.*;

@Entity
@Table(name = "rol")
public class RolDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_rol")
    private Long idRol;
    @Column(name = "nombre")
    private String name;

    public Long getIdRol() {
        return idRol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
