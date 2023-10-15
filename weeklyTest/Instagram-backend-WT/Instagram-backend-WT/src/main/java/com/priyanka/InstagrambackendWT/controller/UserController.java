package com.priyanka.InstagrambackendWT.controller;

import com.priyanka.InstagrambackendWT.model.User;
import com.priyanka.InstagrambackendWT.model.dto.SignInInput;
import com.priyanka.InstagrambackendWT.model.dto.SignUpOutput;
import com.priyanka.InstagrambackendWT.service.AuthenticationService;
import com.priyanka.InstagrambackendWT.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Validated
@RestController
public class UserController {

    @Autowired
    UserService userService;
    @Autowired
    AuthenticationService authenticationService;
    @PostMapping("user/signup")
    public SignUpOutput signUpInstaUser(@RequestBody User user) {

        return userService.signUpUser(user);
    }

    @PostMapping("user/signIn")
    public String signInInstaUser(@RequestBody @Valid SignInInput signInInput) {
        return userService.signInUser(signInInput);
    }

    @DeleteMapping("user/signOut")
    public String signOutInstaUser(String email, String token) {
        if (authenticationService.authenticate(email, token)) {
            return userService.signOutUser(email);
        } else {
            return "Sign out not allowed for non authenticated user.";
        }
    }
}
