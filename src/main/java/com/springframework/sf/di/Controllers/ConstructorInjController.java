package com.springframework.sf.di.Controllers;

import com.springframework.sf.di.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjController {
    private final GreetingService greetingService;

    public ConstructorInjController(@Qualifier("constructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String sayHello() {
        return greetingService.sayHello();
    }
}
