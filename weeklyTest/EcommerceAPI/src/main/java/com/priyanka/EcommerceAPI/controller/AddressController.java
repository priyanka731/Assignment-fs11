package com.priyanka.EcommerceAPI.controller;

import com.priyanka.EcommerceAPI.model.Address;
import com.priyanka.EcommerceAPI.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressController {
    @Autowired
    AddressService addressService;

    @PostMapping("address")
    public String addAddress(@RequestBody Address newAddress){
        return addressService.saveAddress(newAddress);
    }
}