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
        if (isbn == null || isbn.isEmpty() || title == null || title.isEmpty()|| books.containsKey(isbn)) {
            return false;  
        }
        books.put(isbn, new Book(isbn, title, author, year));
        return true;
    }

       
        public void viewAvailableBooks() {
            for (Book book : books.values()) {
                if (!book.isBorrowed()) {
                    System.out.println(book);
                }
            }
        }
    
        public boolean borrowBook(String isbn) {
            Book book = books.get(isbn);
            if (book != null && !book.isBorrowed()) {
                book.borrow();
                return true;
            } else {
                return false;  
            }
        }
    
        public boolean returnBook(String isbn) {
            Book book = books.get(isbn);
            if (book != null && book.isBorrowed()) {
                book.returnBook();
                return true;
            } else {
                return false;  
            }
        }

    public Map<String, Book> getBooks() {
        return books;
    }
}
