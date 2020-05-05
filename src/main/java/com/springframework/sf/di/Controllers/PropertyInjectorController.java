package com.springframework.sf.di.Controllers;

import com.springframework.sf.di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectorController {

    @Qualifier("properyGreetingService")
    @Autowired
    public GreetingService greetingService;

    public String sayGreetings() {
        return greetingService.sayHello();
    }

}
