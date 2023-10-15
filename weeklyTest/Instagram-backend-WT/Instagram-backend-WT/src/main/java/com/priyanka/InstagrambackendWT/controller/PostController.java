package com.priyanka.InstagrambackendWT.controller;

import com.priyanka.InstagrambackendWT.model.Post;
import com.priyanka.InstagrambackendWT.service.AuthenticationService;
import com.priyanka.InstagrambackendWT.service.PostService;
import com.priyanka.InstagrambackendWT.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PostController {

    @Autowired
    UserService userService;

    @Autowired
    PostService postService;
    @Autowired
    AuthenticationService authenticationService;

    @GetMapping("post")
    public Post getPostByPostId(@RequestParam Long postId, @RequestParam String userEmail, @RequestParam String userToken)
    {
        if(authenticationService.authenticate(userEmail,userToken)) {
            return postService.getPostById(postId);
        }
        else {
            return null;
        }
    }

    @PostMapping("post")
    public String createInstaPost(@RequestBody Post post, @RequestParam String email, @RequestParam String token) {
        if (authenticationService.authenticate(email, token)) {
            return userService.createInstaPost(post, email);
        } else {
            return "Not an Authenticated user activity!!!";
        }
    }
}