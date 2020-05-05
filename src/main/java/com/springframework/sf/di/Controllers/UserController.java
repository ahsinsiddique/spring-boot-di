package com.springframework.sf.di.Controllers;

import com.springframework.sf.di.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    private final GreetingService greetingService;

    UserController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello() {

        return this.greetingService.sayHello();
    }
}