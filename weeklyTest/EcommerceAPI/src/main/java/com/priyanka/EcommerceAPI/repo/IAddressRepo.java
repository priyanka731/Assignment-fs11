package com.priyanka.EcommerceAPI.repo;

import com.priyanka.EcommerceAPI.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAddressRepo extends JpaRepository<Address,Integer> {
}