package com.lmsolutions.springcourse.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello from GreetingServiceImpl";
    }
}
