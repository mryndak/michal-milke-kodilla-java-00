package com.kodilla.testing.collection;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

//import static org.junit.Assert.*;

public class CollectionTestSuite {
    @Before
    public void before(){
        System.out.println("Test start");
    }
    @After
    public void after(){
        System.out.println("Test end");
    }
    @Test
//   Empty list test is checking whether collection is empty
    public void testOddNumbersExterminatorEmptyList(){
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> testList = new ArrayList<>();
        System.out.println("Empty list test");
        Assert.assertEquals(oddNumbersExterminator.exterminate(testList), testList);
    }
    @Test
    //   Filled list test is checking whether collection consists of even numbers
    public void testOddNumbersExterminatorNormalList() {
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        ArrayList<Integer> testList = new ArrayList<>();
        ArrayList<Integer> evenList = new ArrayList<>();
        System.out.println("Normal list test");
        for (int i = 0; i < 10; i++) {
            testList.add(i);
            if (i % 2 != 0) {
                evenList.add(i);
            }
        }
        Assert.assertEquals(oddNumbersExterminator.exterminate(testList), evenList);
    }
}