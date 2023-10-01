package com.priyanka.EcommerceAPI.controller;

import com.priyanka.EcommerceAPI.model.Users;
import com.priyanka.EcommerceAPI.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("user")
    public String addUser(@RequestBody Users newUsers){
        return userService.addUser(newUsers);
    }

    @GetMapping("userById")
    public List<Users> getUserById(@RequestParam Integer id){
        return userService.getUserById(id);
    }
}