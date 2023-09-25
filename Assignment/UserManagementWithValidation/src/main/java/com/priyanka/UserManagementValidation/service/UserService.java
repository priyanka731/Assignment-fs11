package com.priyanka.UserManagementValidation.service;

import com.priyanka.UserManagementValidation.model.User;
import com.priyanka.UserManagementValidation.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public String createUser(User user) {
        List<User> originalList = getAllUsers();
        originalList.add(user);
        return "New user added";
    }

    public List<User> getAllUsers() {

        return userRepo.getUsers();
    }
    public User getUserById(Integer userId) {

        for(User user : userRepo.getUsers())
        {
            if(user.getUserId().equals(userId))
            {
                return user;
            }
        }
        throw new IllegalStateException("not found");
    }

    public String updateUserPhoneNumber(Integer userId, String phoneNumber) {

        for(User user : userRepo.getUsers())
        {
            if(user.getUserId().equals(userId))
            {
                user.setPhoneNumber(phoneNumber);
                return " Contact updated ";
            }
        }
        return " Not Found ";
    }
    public  String DeleteUser(Integer userId) {
        for(User user : getAllUsers())
        {
            if(user.getUserId().equals(userId))
            {
                userRepo.delete(user);
                return "user removed ";
            }
        }
        return "  doesn't exist" ;
    }
}