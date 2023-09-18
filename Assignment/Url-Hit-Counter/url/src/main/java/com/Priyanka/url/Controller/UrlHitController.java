package com.Priyanka.url.Controller;

import com.Priyanka.url.Entity.UrlHitCounter;
import com.Priyanka.url.Service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UrlHitController {

    @Autowired
    private UrlHitService urlHitService;

    @PostMapping("visitor")
    public String addAVisitor(@RequestBody UrlHitCounter user)
    {
        return urlHitService.addVisitor(user);
    }

    @GetMapping("visitors") //get all Visitors
    public List<UrlHitCounter> getAllVisitors()
    {
        return urlHitService.getAllVisitors();
    }

    @GetMapping("visitor/count") //Visitor Count
    public String getTheNumberOfVisitors()
    {
        return urlHitService.getCountOfVisitors();
    }

    @GetMapping("api/v1/visitor-count-app/username/{username}") //get specific user
    public UrlHitCounter getAVisitor(@PathVariable String username)
    {
        return urlHitService.getAVisitor(username);
    }
    @PutMapping("api/v1/count_update/username/{username}")
    public String countUpdated(@PathVariable  String username)
    {
        return urlHitService.countUpdated(username);
    }
}