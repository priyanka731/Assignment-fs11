package com.priyanka.Mapping_WeeklyTest.Service;

import com.priyanka.Mapping_WeeklyTest.Model.Address;
import com.priyanka.Mapping_WeeklyTest.Repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService {
    @Autowired
    IAddressRepo addressRepo;

    public Iterable<Address> getAllAddress(){
        return addressRepo.findAll();
    }

    public void addAddress(Address address) {
        addressRepo.save(address);
    }

    public String updateAddress(Long addressId, String addressState) {

        if(addressRepo.existsById(addressId)){
            addressRepo.updateAddressState(addressState,addressId);
            return "Address is Updated";
        }
        else{
            return "Address Id does not exist";
        }
    }

    public String deleteAddress(Long addressId){
        if (addressRepo.existsById(addressId)){
            addressRepo.deleteAddress(addressId);
            return "Address is deleted";
        }
        else{
            return "Address Id does not exists";
        }
    }
}