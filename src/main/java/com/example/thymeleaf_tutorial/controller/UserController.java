package com.example.thymeleaf_tutorial.controller;

import com.example.thymeleaf_tutorial.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    // handler method to handle variable- expresion request
    @GetMapping("variable-expression")
    public String variableExpression(Model model) {
        User user = new User("Sandu", "sandu@gmail.com", "Moderator", "Male");
        model.addAttribute("user", user);
        return "variable-expression";

    }

    //handler method to handle selection expression
    @GetMapping("selection-expression")
    public String selectionExpression(Model model) {
        User user = new User("Alexandru", "alexandru@gmail.com", "Moderator", "Male");
        model.addAttribute("user", user);
        return "selection-expression";
    }

}
