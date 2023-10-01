package com.priyanka.EcommerceAPI.controller;


import com.priyanka.EcommerceAPI.model.Orders;
import com.priyanka.EcommerceAPI.service.OrderService;
import jakarta.persistence.criteria.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class OrderController {
    @Autowired
    OrderService orderService;

    @PostMapping("order")
    public String placeOrder(@RequestBody Orders newOrders){
        return orderService.placeOrder(newOrders);
    }

    @GetMapping("orderById")
    public List<Orders> getOrdersById(@RequestParam Integer id){
        return  orderService.getOrderById(id);
    }
}