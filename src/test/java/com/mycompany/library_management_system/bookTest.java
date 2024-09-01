package com.mycompany.library_management_system;



import com.mycompany.library_management_system.Book;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class bookTest {

    private Book book;

    @Before
    public void setUp() {
        book = new Book("978-0134685991", "Effective Java", "Joshua Bloch", 2018);
    }

    @Test
    public void testBookCreation() {
        assertEquals("978-0134685991", book.getIsbn());
        assertEquals("Effective Java", book.getTitle());
        assertEquals("Joshua Bloch", book.getAuthor());
        assertEquals(2018, book.getPublicationYear());
        assertFalse(book.isBorrowed());
    }
    
   
}
