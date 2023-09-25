package com.priyanka.UserManagementValidation.configuration;

import com.priyanka.UserManagementValidation.model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanFactory {
   @Bean
    public List<User> getIntializedList(){
       List<User> initList = new ArrayList<>();
       return initList;

    }
}
