package com.lmsolutions.springcourse.didemo.services;

import org.springframework.stereotype.Controller;

@Controller
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hello from ConstructorGreetingService";
    }
}
