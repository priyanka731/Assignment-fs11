package com.priyanka.EcommerceAPI.repo;

import com.priyanka.EcommerceAPI.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IProductRepo extends JpaRepository<Product,Integer> {
    List<Product> findByProdCategory(String category);
}