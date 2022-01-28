package com.example.prueba.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class GreetingTest {

    @InjectMocks
    private Greeting greeting;

    @Test
    void successResponse() {
        assertEquals("Hello world!", greeting.greeting());
    }

    @Test
    void badResponse() {
        assertNotEquals("Hello Jhon Doe", greeting.greeting());
    }
}