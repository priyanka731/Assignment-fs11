package com.priyanka.EcommerceAPI.service;

import com.priyanka.EcommerceAPI.model.Users;
import com.priyanka.EcommerceAPI.repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class UserService {
    @Autowired
    IUserRepo UserRepo;

    public String addUser(Users newUsers){
        UserRepo.save(newUsers);
        return "User Added";
    }

    public List<Users> getUserById(Integer id){
        return UserRepo.findAllById(Collections.singleton(id));
    }
}