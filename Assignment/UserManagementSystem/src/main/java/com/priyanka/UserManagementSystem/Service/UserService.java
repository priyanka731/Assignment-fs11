package com.priyanka.UserManagementSystem.Service;

import com.priyanka.UserManagementSystem.Model.User;
import com.priyanka.UserManagementSystem.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {


    @Autowired

    UserRepo userRepo;
    private Integer userId;

    public  String DeleteUser(Integer userId) {
        for(User user : getAllUsers())
        {
            if(user.getUserId().equals(userId))
            {

                userRepo.delete(user);

                return "user removed for userID:" + userId;
            }
        }
        return  "User"+ userId + " is not deleted as it doesn't exist" ;
    }

    public List<User> getAllUsers() {

        return userRepo.getUsers();
    }


    public String createUser(User user) {
        List<User> originalList = getAllUsers();
        originalList.add(user);
        return "New user added";
    }


    public User getUserById(Integer userId) {
        this.userId = userId;

        for(User user : userRepo.getUsers())
        {
            if(user.getUserId().equals(userId))
            {
                return user;
            }
        }
        throw new IllegalStateException("UserId not found");
    }


    public String updateUserContact(Integer userId, String userContact) {

        for(User user : userRepo.getUsers())
        {
            if(user.getUserId().equals(userId))
            {
                user.setUserContact(userContact);
                return "User Contact updated for user ID:" + userId;
            }
        }

        return "user not found for user ID: " + userId;
    }
}