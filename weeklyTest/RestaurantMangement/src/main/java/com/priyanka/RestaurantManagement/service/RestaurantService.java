package com.priyanka.RestaurantManagement.service;

import com.priyanka.RestaurantManagement.model.Restaurant;
import com.priyanka.RestaurantManagement.repo.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {
    @Autowired
    RestaurantRepo restaurantRepo;

    public List<Restaurant> getAllRestaurants(){
        return restaurantRepo.getRestaurants();
    }

    public Restaurant getRestaurant(Integer id){
        List<Restaurant>originalList = getAllRestaurants();

        for (Restaurant restaurant : originalList){

            if(restaurant.getRestaurantId().equals(id)){
                return restaurant;
            }
        }

        throw new IllegalStateException("Restaurant not found");
    }

    public String addRestaurant(Restaurant restaurant){
        List<Restaurant> originalList = getAllRestaurants();

        originalList.add(restaurant);

        return "Restaurant added!";
    }

    public String addRestaurants(List<Restaurant> restaurant){
        List<Restaurant> originalList = getAllRestaurants();
        originalList.addAll(restaurant);

        return "Restaurants added!";
    }

    public String updateSpecialty(Integer id, String updatedSpecial){
        List<Restaurant> originalList = getAllRestaurants();

        for (Restaurant restaurant: originalList){
            if(restaurant.getRestaurantId().equals(id)){

                restaurant.setRestaurantSpecialty(updatedSpecial);
                return "Specialty Updated!";
            }
        }
        return "Restaurant not found!";
    }

    public String deleteRestaurant(Integer id){

        List<Restaurant> originalList = getAllRestaurants();
        for(Restaurant restaurant : originalList){
            if(restaurant.getRestaurantId().equals(id)){
                originalList.remove(restaurant);
                return "Restaurant Deleted!";
            }
        }

        return "Restaurant not found!";

    }
}
