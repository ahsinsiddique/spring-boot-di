package com.springframework.sf.di.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Setter GreetingServicee";
    }
}
