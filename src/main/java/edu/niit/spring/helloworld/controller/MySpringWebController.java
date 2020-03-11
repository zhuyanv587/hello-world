package edu.niit.spring.helloworld.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/springWeb")
public class MySpringWebController {
    @RequestMapping("/hello")
    public String hello(){
        return "Hello, Spring Boot!";
    }
}
