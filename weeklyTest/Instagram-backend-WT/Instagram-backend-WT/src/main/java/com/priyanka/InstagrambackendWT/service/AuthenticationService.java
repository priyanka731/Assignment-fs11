package com.priyanka.InstagrambackendWT.service;

import com.priyanka.InstagrambackendWT.model.AuthenticationToken;
import com.priyanka.InstagrambackendWT.model.User;
import com.priyanka.InstagrambackendWT.repository.IAuthTokenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    @Autowired
    IAuthTokenRepo authTokenRepo;

    public boolean authenticate(String email, String authTokenValue)
    {
        AuthenticationToken authToken = authTokenRepo.findFirstByTokenValue(authTokenValue);

        if(authToken == null)
        {
            return false;
        }

        String tokenConnectedEmail = authToken.getUser().getUserEmail();

        return tokenConnectedEmail.equals(email);
    }
    public void saveAuthToken(AuthenticationToken authToken)
    {
        authTokenRepo.save(authToken);
    }

    public AuthenticationToken findFirstByUser(User user) {
        return authTokenRepo.findFirstByUser(user);
    }

    public void removeToken(AuthenticationToken token) {
        authTokenRepo.delete(token);
    }
}