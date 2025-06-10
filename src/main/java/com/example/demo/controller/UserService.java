package com.example.demo.controller;

import com.example.demo.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service

public class UserService {
    private final List<User>store= new ArrayList<>();

    public UserService(){
        store.add(new User(UUID.randomUUID().toString(),"Ayushmna","ayushmangiri@gmail.com","pass@123"));
        store.add(new User(UUID.randomUUID().toString(),"harsh","harshgiri@gmail.com","pass@123"));

        store.add(new User(UUID.randomUUID().toString(),"akshay","akshaygiri@gmail.com","pass@123"));

        store.add(new User(UUID.randomUUID().toString(),"chandra","chandragiri@gmail.com","pass@123"));

    }
    public List<User> getUsers(){
        return this.store;
    }
}
