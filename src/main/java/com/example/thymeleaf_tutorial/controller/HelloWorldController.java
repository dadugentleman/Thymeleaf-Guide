package com.example.thymeleaf_tutorial.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    // handler method to handle //helloworld request

    @GetMapping("/hello-world")
    public String helloWorld(Model model) {
        model.addAttribute("message", "Hello World!");
        model.addAttribute("carName", "Mercedes-Benz");
        model.addAttribute("ShoesBrand", "Adidas");
        return "hello-world";
    }

}
