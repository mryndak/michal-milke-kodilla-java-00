package com.kodilla.patterns.singleton;

import com.kodilla.patterns.sigleton.SettingsFileEngine;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.Test;

public class SettingsFileEngineTestSuite {
    private static SettingsFileEngine settingsFileEngine;
    private static int testCounter = 0;

    @BeforeClass
    public static void openSettingsFile() {
        settingsFileEngine = new SettingsFileEngine();
        settingsFileEngine.open("myapp.settings");
    }

    @AfterClass
    public static void closeSettingsFile() {
        settingsFileEngine.close();
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("\nPeparing to execute test #" + testCounter);
    }

    @Test
    public void testGetFileName() {
        //Given
        //When
        String fileName = settingsFileEngine.getFileName();
        System.out.println("Opened: " + fileName);
        //Then
        Assert.assertEquals("myapp.settings", fileName);
    }

    @Test
    public void testLoadSettings() {
        //Given
        //When
        boolean result = settingsFileEngine.loadSettings();
        //Then
        Assert.assertTrue(result);
    }

    @Test
    public void testSaveSettings() {
        //Given
        //When
        boolean result = settingsFileEngine.saveSettings();
        //Then
        Assert.assertTrue(result);
    }

}
