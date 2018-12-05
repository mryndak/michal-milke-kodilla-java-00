package com.kodilla.testing.shape;

import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ShapeCollectorTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeTestSuite() {
        System.out.println("Beginning of the Test");
    }

    @AfterClass
    public static void afterTestSuite() {
        System.out.println("The end of Test Suite");
    }
    @AfterClass
    public static void afterTestsSuite() {
        System.out.println("Every single test was finally accepted... thus passed either:)");
        System.out.println(" ");
    }

    @Before
    public void beforeEachTest() {
        testCounter++;
        System.out.println("Starting test nr " + testCounter);
//        System.out.println("\nStarting test nr " + testCounter);
    }

    /*
        @Test
        public void addFigureNotExisting() {

            //Given
            Shape circle = new Circle(5, "circle");
            ShapeCollector collector = new ShapeCollector();

            //When
            boolean result = collector.addFigure(circle);
            //Then
             Assert.assertEquals(null, collector.getFigure(0));
            Assert.assertTrue(collector.shapes.isEmpty());
            Assert.assertFalse(result);
        }
    */
    @Test
    public void testAddFigure() {
        //Given
        Shape circle = new Circle(4, "Circle");
        ShapeCollector collector = new ShapeCollector();

        //When
        boolean result = collector.addFigure(circle);


        //Then
//        Assert.assertTrue(result);
    }

    @Test
    public void testRemoveFigure() {
        //Given
        Shape triangle = new Triangle(3, 4, "triangle");
        ShapeCollector collector = new ShapeCollector();

        //When
        collector.addFigure(triangle);
        boolean result = collector.removeFigure(triangle);
//        List<Shape> figures = collector.showFigures();

        //Then
        Assert.assertTrue(result);
        //  Assert.assertEquals(null,figures);
    }

    @Test
    public void testGetFigure() {
        //Given
        Shape square = new Square(2, "square");
        ShapeCollector collector = new ShapeCollector();

        //When
        collector.addFigure(square);
        Shape result = collector.getFigure(0);

        //Then
        Assert.assertEquals(square, result);
    }
    static void finalne () {
        System.out.println("Every single test was finally accepted");
    }
    @Test
    public void testShowFigures() {
        //Given
        //do updatu

        Shape square = new Square(2, "square");
        Shape circle = new Circle(4, "circle");
        Shape triangle = new Triangle(3, 4, "triangle");
        ShapeCollector collector = new ShapeCollector();

       }
    }







