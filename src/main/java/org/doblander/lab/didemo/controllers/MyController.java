package org.doblander.lab.didemo.controllers;

import org.doblander.lab.didemo.services.GreetingService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello() {

        System.out.println("Hello!!!");

        return greetingService.sayGreeting();
    }
}
