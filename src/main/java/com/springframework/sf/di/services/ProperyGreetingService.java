package com.springframework.sf.di.services;

import org.springframework.stereotype.Service;

@Service
public class ProperyGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Property Service: hello";
    }
}
