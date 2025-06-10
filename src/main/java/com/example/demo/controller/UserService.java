package com.example.demo.controller;

import com.example.demo.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service

public class UserService {
    private List<User> store = new ArrayList<>();
}
