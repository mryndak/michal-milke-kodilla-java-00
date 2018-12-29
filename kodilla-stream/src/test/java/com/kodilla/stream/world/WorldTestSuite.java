package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity(){

        //Given
        //Create counties

        Country country1 = new Country("Poland","356000000");
        Country country2 = new Country("Lin","1174311111");
        Country country3 = new Country("Uth","1111111111");
        Country country4 = new Country("Strieb","2547222222");
        Country country5 = new Country("Sento","3332211222");
        Country country6 = new Country("Ikhr","9807222222");

        //Create continents

        Continent siedlce = new Continent("Siedlce");
        siedlce.addCoutry(country1);
        siedlce.addCoutry(country2);
        siedlce.addCoutry(country3);

        Continent raszyn = new Continent("Raszyn");
        raszyn.addCoutry(country4);
        raszyn.addCoutry(country5);
        raszyn.addCoutry(country6);

        //Create world

        World world = new World();
        world.addContinents(siedlce);
        world.addContinents(raszyn);

        //When

        BigDecimal result = world.getPeopleQuantity();
        BigDecimal expected = new BigDecimal("18328077888");

        //Then
        Assert.assertEquals(expected,result);

    }
}