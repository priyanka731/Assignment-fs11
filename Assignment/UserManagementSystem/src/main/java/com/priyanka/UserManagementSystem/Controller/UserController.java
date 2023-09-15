package com.priyanka.UserManagementSystem.Controller;

import com.priyanka.UserManagementSystem.Model.User;
import com.priyanka.UserManagementSystem.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;



    @PostMapping("users") // add user
    public String addUser(@RequestBody User user)
    {
        return userService.createUser(user);
    }
    @GetMapping("users/search/{userId}")
    public User getUserByUserid(@PathVariable Integer userId){
        return userService.getUserById(userId);
    }
    @GetMapping(value = "users")
    public List<User> getAllUsers()
    {
        return userService.getAllUsers();
    }
    @DeleteMapping("users/delete/{userId}")

    public String DeleteUserById (@PathVariable Integer userId ){

        return userService.DeleteUser(userId);
    }

    @PutMapping("users/{userId}/{userContact}")
    public String UpdateUser(@PathVariable Integer userId,@PathVariable String userContact)
    {
        return userService.updateUserContact(userId,userContact);
    }

}