package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {


    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<Book>();
        Book book = new Book("The book title", "The book author", 2000);
        bookList.add(book);

        // temporary returning list of one book
        return bookList;
    }
}