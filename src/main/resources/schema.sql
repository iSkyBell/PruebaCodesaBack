create table rol(
    id_rol int AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(255) NOT NULL
);

create table usuario (
    id_usuario int AUTO_INCREMENT PRIMARY KEY,
    id_rol int not null,
    nombre varchar(255) not null,
    activo boolean not null,
    FOREIGN KEY (id_rol) REFERENCES rol(id_rol)
);