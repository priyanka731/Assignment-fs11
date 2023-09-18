package com.Priyanka.url.Service;

import com.Priyanka.url.Entity.UrlHitCounter;
import com.Priyanka.url.Repository.UrlHitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UrlHitService {

    @Autowired
    UrlHitRepo urlHitRepo;

    public List<UrlHitCounter> getAllVisitors()
    {
        return  urlHitRepo.getUrlHitCounter();
    }


    public String addVisitor(UrlHitCounter user) {
        List<UrlHitCounter> visitorlist = getAllVisitors();
        for(UrlHitCounter url : visitorlist)
        {
            if(url.getUserName().equals(user.getUserName()))
            {
                url.setCounter(url.getCounter()+1);
                return " same visitor can't be updated, count updated";
            }
        }
        visitorlist.add(user);

        return "Welcome Here !!!";
    }


    public String getCountOfVisitors() {

        List<UrlHitCounter> al = getAllVisitors();

        return "Visitors: "+al.size();
    }


    public UrlHitCounter getAVisitor(String username) {
        List<UrlHitCounter> visitorlist = getAllVisitors();
        for(UrlHitCounter url : visitorlist)
        {
            if(url.getUserName().equals(username))
            {
                return url;

            }
        }
        throw new IllegalStateException("Not found");
    }

    public String countUpdated(String username) {
        List<UrlHitCounter> visitorlist = getAllVisitors();
        for(UrlHitCounter url : visitorlist)
        {
            if(url.getUserName().equals(username))
            {
                url.setCounter(url.getCounter()+1);
                return "Welcome Again";
            }
        }


        return "new User";
    }
}