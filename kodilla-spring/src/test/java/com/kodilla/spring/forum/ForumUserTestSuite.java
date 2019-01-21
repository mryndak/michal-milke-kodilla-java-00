package com.kodilla.spring.forum;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ForumUserTestSuite {

    @Test
    public void testForumUserLoadedIntoContainer() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        ForumUser forumUser = context.getBean(ForumUser.class);

        String username = forumUser.username;

        //Then
        Assert.assertEquals("John Smith", username);

        System.out.println("Comparing whether username of person known as John " +
                "Smith matches with Username: " + forumUser.username);

    }

    @Test
    public void testForumUserRealNameLoadedIntoContainer() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        ForumUser forumUser = context.getBean(ForumUser.class);

        String realName = forumUser.realName;

        //Then
        Assert.assertEquals("Bob Sinclair", realName);

        System.out.println("Comparing whether realName of person known as Bob " +
                "Sinclair matches with realName: " + forumUser.realName);
    }
}