package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    String username;
    String realName;

    public ForumUser() {
        username = "John Smith";
        realName = "Bob Sinclair";


    }

}
