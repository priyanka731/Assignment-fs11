package com.priyanka.EcommerceAPI.service;



import com.priyanka.EcommerceAPI.model.Orders;
import com.priyanka.EcommerceAPI.repo.IOrderRepo;
import jakarta.persistence.criteria.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class OrderService {
    @Autowired
    IOrderRepo iOrderRepo;

    public String placeOrder(Orders newOrders){
        iOrderRepo.save(newOrders);
        return "Order Placed";
    }

    public List<Orders> getOrderById(Integer id){
        return iOrderRepo.findAllById(Collections.singleton(id));
    }


}