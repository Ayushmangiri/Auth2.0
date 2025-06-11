package com.example.demo.controller;


import com.example.demo.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {


    @Autowired
    private UserService userService;
    @GetMapping("/users")
    public List<User> getUser(){

        System.out.println("Getting User");
        return this.userService.getUsers();
    }
}
