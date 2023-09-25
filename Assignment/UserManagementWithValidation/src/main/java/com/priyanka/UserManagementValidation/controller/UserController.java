package com.priyanka.UserManagementValidation.controller;

import com.priyanka.UserManagementValidation.model.User;
import com.priyanka.UserManagementValidation.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;


    @PostMapping("users") // add user
    public String addUser(@RequestBody @Valid User user)
    {
        return userService.createUser(user);
    }
    @GetMapping(value = "users") //get user
    public List<User> getAllUsers()
    {
        return userService.getAllUsers();
    }

    @GetMapping("users/search/{userId}")//getuserbyId
    public User getUserByUserid(@PathVariable Integer userId){
        return userService.getUserById(userId);
    }

    @PutMapping("users/{userId}/{phoneNumber}")//updateuserInfo
    public String UpdateUser(@PathVariable Integer userId,@PathVariable String phoneNumber)
    {
        return userService.updateUserPhoneNumber(userId, phoneNumber);
    }
    @DeleteMapping("users/delete/{userId}")//delete user

    public String DeleteUserById (@PathVariable Integer userId ){

        return userService.DeleteUser(userId);
    }
}