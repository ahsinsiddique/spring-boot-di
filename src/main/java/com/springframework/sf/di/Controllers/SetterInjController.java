package com.springframework.sf.di.Controllers;

import com.springframework.sf.di.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjController
{
    private GreetingService greetingService;

    @Qualifier("setterGreetingService")
    @Autowired
   public void setGreetingService(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String sayHello() {
        return this.greetingService.sayHello();
    }

}
