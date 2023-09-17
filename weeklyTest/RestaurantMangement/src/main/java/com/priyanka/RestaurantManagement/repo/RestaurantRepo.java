package com.priyanka.RestaurantManagement.repo;

import com.priyanka.RestaurantManagement.model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class RestaurantRepo {

    @Autowired
    List<Restaurant> restaurantList;

    public List<Restaurant> getRestaurants(){
        return restaurantList;
    }

    public void addRestaurant(Restaurant restaurant){
        List<Restaurant>listOfRestaurant = getRestaurants();
        listOfRestaurant.add(restaurant);
    }
}