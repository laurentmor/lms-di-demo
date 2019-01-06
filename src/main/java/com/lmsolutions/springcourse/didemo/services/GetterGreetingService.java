package com.lmsolutions.springcourse.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GetterGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello from GetterGreetingService";
    }
}
