package com.lmsolutions.springcourse.didemo.controllers;

import com.lmsolutions.springcourse.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {


    public GreetingService greetingServiceImpl;

    public String sayHello() {
        return greetingServiceImpl.sayHello();
    }
}

