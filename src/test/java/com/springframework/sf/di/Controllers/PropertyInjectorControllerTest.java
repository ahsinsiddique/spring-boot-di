package com.springframework.sf.di.Controllers;

import com.springframework.sf.di.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectorControllerTest {


    PropertyInjectorController propertyInjectorController;

    @BeforeEach
    void setUp() {
        propertyInjectorController = new PropertyInjectorController();
        propertyInjectorController.greetingService = new ConstructorGreetingService();
    }

    @Test
    void sayGreetings() {
        System.out.println(propertyInjectorController.sayGreetings());
    }
}