package com.priyanka.Mapping_WeeklyTest.Controller;

import com.priyanka.Mapping_WeeklyTest.Model.Address;
import com.priyanka.Mapping_WeeklyTest.Service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;


    @PostMapping("address")
    public void addAddress(@RequestBody Address address)
    {
        addressService.addAddress(address);
    }

    @GetMapping("address")
    public Iterable<Address> getAllAddress(){
        return addressService.getAllAddress();
    }

    @PutMapping("address/update/of")
    public String updateAddress(@RequestParam("addressId") Long addressId, @RequestParam("addressState") String addressState){
        return addressService.updateAddress(addressId,addressState);
    }

    @DeleteMapping("address/delete/of")
    public String deleteAddress(@RequestParam("addressId") Long addressId){
        return addressService.deleteAddress(addressId);
    }
}