package com.priyanka.Mapping_WeeklyTest.Service;

import com.priyanka.Mapping_WeeklyTest.Model.Laptop;
import com.priyanka.Mapping_WeeklyTest.Repository.ILaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class LaptopService {
    @Autowired
    ILaptopRepo laptopRepo;
    public Iterable<Laptop> getAllLaptop(){

        return laptopRepo.findAll();
    }
    public void addLaptop(Laptop laptop) {
        laptopRepo.save(laptop);
    }

    public String updateLaptopBrand(Long laptopId, String laptopTitle) {

        if(laptopRepo.existsById(laptopId)){
            laptopRepo.updateLaptopBrand(laptopTitle,laptopId);
            return "laptop brand  is Updated";
        }
        else{
            return "laptop Id does not exist";
        }
    }

    public String deleteLaptop(Long laptopId){
        if (laptopRepo.existsById(laptopId)){
            laptopRepo.deleteLaptop(laptopId);
            return "laptop is deleted";
        }
        else{
            return "laptop Id does not exists";
        }
    }
}