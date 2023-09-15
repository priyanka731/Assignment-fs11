package com.priyanka.UserManagementSystem.Factory;

import com.priyanka.UserManagementSystem.Model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
class BeanFactory {

    @Bean
    public List<User> getInitializedList()
    {
//        User initUser = new User(0,"demo","dmo","9999999999","dmo dmo dmo dmo dmo");
        List<User> initList = new ArrayList<>();
        //initList.add(initUser);

        return initList;
    }
}
