package com.priyanka.EcommerceAPI.service;

import com.priyanka.EcommerceAPI.model.Address;
import com.priyanka.EcommerceAPI.repo.IAddressRepo;
import com.priyanka.EcommerceAPI.repo.IUserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    @Autowired
    IAddressRepo addressRepo;

    @Autowired
    IUserRepo iUserRepo;

    public String saveAddress(Address newAddress) {

        addressRepo.save(newAddress);
        return "Address Added";
    }
}