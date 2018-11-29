package com.kodilla.testing.forum;

import com.kodilla.testing.user.SimpleUser;
import org.junit.Assert;
import org.junit.Test;

public class ForumTestSuite {
    @Test
    public void testCaseUsername(){
        //Given
        SimpleUser simpleUser = new SimpleUser("theForumUser", "Jefrey", "Mobbins");
        //When
        String result = simpleUser.getUsername();
        String result1 = simpleUser.getRealName();
        String result2 = simpleUser.getSurname();
        //Then
        Assert.assertEquals("theForumUser", result);
        Assert.assertEquals("Jefrey", result1);
        Assert.assertEquals("Mobbins", result2);
    }
}

