package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LoggerTestSuite {
    private static int testCounter = 0;

    @Before
    public  void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);

    }

    @Test
    public void testGetLastLog() {
        //Given
        Logger.getInstance().log("that's the content of the log");
        Logger.getInstance().log("last log");

        //When
        String result = Logger.getInstance().getLastLog();

        //Then
        Assert.assertEquals("last log", result);
    }
}
