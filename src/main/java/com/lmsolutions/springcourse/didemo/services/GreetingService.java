package com.lmsolutions.springcourse.didemo.services;


public interface GreetingService {
    default String sayHello() {
        return "Hello fom interface";
    }

}
