/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.library_management_system;

import java.util.HashMap;
import java.util.Map;

public class library {

    private Map<String, Book> books;

    public library() {
        books = new HashMap<>();
    }

   
    public boolean addBook(String isbn, String title, String author, int year) {
        
        books.put(isbn, new Book(isbn, title, author, year));
        return true;
    }

    public Map<String, Book> getBooks() {
        return books;
    }
}
