package com.springframework.sf.di.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryGreetingService implements GreetingService {
    @Override
    public  String sayHello() {
        return "Primary --- hello world";
    }
}
