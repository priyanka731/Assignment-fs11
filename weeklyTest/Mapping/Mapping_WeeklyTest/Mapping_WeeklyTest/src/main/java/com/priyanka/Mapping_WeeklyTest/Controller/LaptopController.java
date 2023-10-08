package com.priyanka.Mapping_WeeklyTest.Controller;

import com.priyanka.Mapping_WeeklyTest.Model.Laptop;
import com.priyanka.Mapping_WeeklyTest.Service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class LaptopController {
    @Autowired
    LaptopService  laptopService;
    @GetMapping("laptop")
    public Iterable<Laptop> getAllLaptop(){
        return laptopService.getAllLaptop();
    }

    @PostMapping("laptop")
    public void addLaptop(@RequestBody Laptop laptop)
    {
        laptopService.addLaptop(laptop);
    }

    @PutMapping("laptop/update/of")
    public String updateLaptop(@RequestParam("laptopId") Long laptopId,@RequestParam("laptopBrand") String laptopBrand){
        return laptopService.updateLaptopBrand(laptopId,laptopBrand);
    }

    @DeleteMapping("laptop/delete/of")
    public String deleteLaptop(@RequestParam("laptopId") Long laptopId){
        return laptopService.deleteLaptop(laptopId);
    }
}