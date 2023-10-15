package com.priyanka.InstagrambackendWT.repository;

import com.priyanka.InstagrambackendWT.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User,Long> {
    User findFirstByUserEmail(String email);
}