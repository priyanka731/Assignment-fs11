package com.priyanka.EcommerceAPI.repo;

import com.priyanka.EcommerceAPI.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<Users,Integer> {
}