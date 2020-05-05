package com.springframework.sf.di.Controllers;

import com.springframework.sf.di.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjControllerTest {

    ConstructorInjController constructorInjController;
    @BeforeEach
    void setUp() {
        constructorInjController = new ConstructorInjController(new ConstructorGreetingService());
    }

    @Test
    void sayHello() {
        System.out.println(constructorInjController.sayHello());
    }
}