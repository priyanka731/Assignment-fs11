package com.priyanka.InstagrambackendWT.repository;

import com.priyanka.InstagrambackendWT.model.Post;
import com.priyanka.InstagrambackendWT.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPostRepo extends JpaRepository<Post,Long> {

    Post findFirstByUser(User user);
}