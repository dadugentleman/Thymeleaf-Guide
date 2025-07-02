package com.example.thymeleaf_tutorial.controller;

import com.example.thymeleaf_tutorial.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

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

    // handler method to handle message expression request
    @GetMapping("/message-expression")
    public String messageExpression() {
        return "message-expression";
    }

    // handler method to handle link expression
    @GetMapping("/link-expression")
    public String linkExpression(Model model){
        model.addAttribute("id", 1);
        return "link-expression";
    }

    // handler method to handle fragment expression
    @GetMapping("/fragment-expression")
    public String fragmentExpression(){
        return "fragment-expression";
    }

    @GetMapping("/users")
    public String users(Model model) {
        User admin = new User("Admin", "admin@gmail.com", "ADMIN", "Male");
        User sandu = new User("Sandu", "sandug@gmail.com", "Owner", "Male");
        User catalina = new User("Catalina", "catalina@gmail.com", "Administrator", "Female");
        List<User> users = new ArrayList<>();
        users.add(sandu);
        users.add(catalina);
        users.add(admin);
        model.addAttribute("users", users);
        return "users";

    }



}
