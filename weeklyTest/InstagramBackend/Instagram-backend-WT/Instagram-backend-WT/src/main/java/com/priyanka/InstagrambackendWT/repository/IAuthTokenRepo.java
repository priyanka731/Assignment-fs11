package com.priyanka.InstagrambackendWT.repository;

import com.priyanka.InstagrambackendWT.model.AuthenticationToken;
import com.priyanka.InstagrambackendWT.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAuthTokenRepo extends JpaRepository<AuthenticationToken,Long> {
    AuthenticationToken findFirstByTokenValue(String authTokenValue);

    AuthenticationToken findFirstByUser(User user);

}