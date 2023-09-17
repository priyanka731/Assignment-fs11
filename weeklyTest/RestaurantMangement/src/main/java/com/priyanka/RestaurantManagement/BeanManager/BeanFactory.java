package com.priyanka.RestaurantManagement.BeanManager;

import com.priyanka.RestaurantManagement.model.Restaurant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;
@Configuration
public class BeanFactory {
    @Bean
    public List<Restaurant> restaurantList(){
        return new ArrayList<>();

    }
}
