package org.doblander.lab.didemo.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String hello() {

        System.out.println("Hello from my controller!");

        return "hello";
    }
}
