package edu.niit.spring.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class MySpringBootController {
    @RequestMapping("/hello")
    public String hello(){
        return "Hello, Spring Boot!";
    }
}
