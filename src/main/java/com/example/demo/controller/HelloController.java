package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        System.out.println("Hello endpoint was hit");
        return "Hello World";
    }

    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name) {
        System.out.println("Greet endpoint was hit with name " + name);
        return "Hello " + name;
    }

    @GetMapping("/status")
    public String status() {
        System.out.println("Status endpoint was hit");
        return "OK";
    }
}
