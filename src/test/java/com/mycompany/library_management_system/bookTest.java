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

    @Test
    public void testBorrowBook() {
        book.borrow();
        assertTrue(book.isBorrowed());
    }

    @Test(expected = IllegalStateException.class)
    public void testBorrowAlreadyBorrowedBook() {
        book.borrow();
        book.borrow();
    }

    @Test
    public void testReturnBook() {
        book.borrow();
        book.returnBook();
        assertFalse(book.isBorrowed());

    }

    @Test
    public void testToString() {
        String expected = "Effective Java by Joshua Bloch (ISBN: 978-0134685991, Year: 2018)";
        assertEquals(expected, book.toString());
    }


    
   
}
