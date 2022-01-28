# PruebaCodesaBack
Prueba técnica de Codesa

Paras las peticiones cuando se ejecuta el programa son las siguientes:

## GET
> GET http://localhost:8080/user/

## GET con usuario
> GET http://localhost:8080/user/test

## POST
> POST http://localhost:8080/user

```
{
  "idRol": 3,
  "name": "test",
  "active": false
}
```

## PUT
> PUT http://localhost:8080/user

```
{
  "id": 1,
  "idRol": 3,
  "name": "test",
  "active": true
}
```
## DELETE
> DELETE http://localhost:8080/user/1

# Unit Test
Para las Unit Test se hizo unicamente de la clase **UserServicesImplTest**

# Requerimientos
```
Java 8
IDE: Intellij
Maven
```
