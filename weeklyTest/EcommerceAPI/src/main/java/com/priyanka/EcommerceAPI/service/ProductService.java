package com.priyanka.EcommerceAPI.service;

import com.priyanka.EcommerceAPI.model.Product;
import com.priyanka.EcommerceAPI.repo.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    IProductRepo iProductRepo;

    public String addProduct(Product newProduct){
        iProductRepo.save(newProduct);
        return "Product Added";
    }

    public List<Product> getProductsByCategory(String category){
        return iProductRepo.findByProdCategory(category);
    }

    public String deleteProduct(Integer id){
        iProductRepo.deleteById(id);
        return "Product Deleted";
    }
}