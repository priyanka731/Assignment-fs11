package com.priyanka.EcommerceAPI.repo;



import com.priyanka.EcommerceAPI.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Set;

@Repository
public interface IOrderRepo extends JpaRepository<Orders,Integer> {
}