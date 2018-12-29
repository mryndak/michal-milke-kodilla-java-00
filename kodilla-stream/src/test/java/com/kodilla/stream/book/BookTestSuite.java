package com.kodilla.stream.book;

import org.junit.*;

import java.util.List;
import java.util.stream.IntStream;

public class BookTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }
    @Test
    public void testGetListUsingFor() {
        //Given
        BookDirectory bookDirectory = new BookDirectory();

        //When
        List<Book> books = bookDirectory.getList();

        //Then
        int numberOfBooksPublicatedAfter2007 = 0;
        for (Book book : books) {
            if (book.getYearOfPublication() > 2007) {
                numberOfBooksPublicatedAfter2007++;
            }
        }
        Assert.assertEquals(3, numberOfBooksPublicatedAfter2007);
        System.out.println("Test concerning its' effects " + "#" + testCounter + ": " +
                (books.get(numberOfBooksPublicatedAfter2007).getYearOfPublication() > 2007));
    }
        @Test
        public void testGetListUsingIntStream() {
            //Given
            BookDirectory bookDirectory = new BookDirectory();

            //When
            List<Book> books = bookDirectory.getList();

            //Then
            int numberOfBooksPublicatedAfter2007 = IntStream.range(0, books.size())
                    .filter(n -> books.get(n).getYearOfPublication() > 2007)
                    .map(n -> 1)
                    .sum();
            Assert.assertEquals(3, numberOfBooksPublicatedAfter2007);

            System.out.println(books.get(numberOfBooksPublicatedAfter2007).getYearOfPublication() > 2007); //just to figure out what man can do;p

            System.out.println("Test concerning what was meant to validate " + "#" + testCounter + ": " +
                    (books.get(numberOfBooksPublicatedAfter2007).getYearOfPublication() > 2007));
        }
    }



