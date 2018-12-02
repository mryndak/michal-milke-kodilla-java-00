package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.*;
import org.junit.Test;

public class ForumTestSuite {

    @Before
    public void before() {
        System.out.println("Test case: is starting");
    }

    @After
    public void after(){
        System.out.println("Test case: no: ");
    }
    @Test
    public void testCaseUsername(){
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "Jefrey", "Mobbins", "35");
        //When
        String result = simpleUser.getUsername();
        System.out.println("Test userName effect: \n" +  result);
        String result1 = simpleUser.getRealName();
        System.out.println("Test realName effect: \n" +  result1);
        String result2 = simpleUser.getSurname();
        System.out.println("Test surName effect: \n" +  result2);
        String result3 = simpleUser.getAge();
        System.out.println("Test age effect: \n" +  result3);
        //Then
        Assert.assertEquals("theForumUser", result);
        Assert.assertEquals("Jefrey", result1);
        Assert.assertEquals("Mobbins", result2);
        Assert.assertEquals("35", result3);
    }
}

