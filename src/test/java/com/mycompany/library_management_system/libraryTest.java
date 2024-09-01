package com.mycompany.library_management_system;



import com.mycompany.library_management_system.library;
import com.mycompany.library_management_system.Book;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class libraryTest {

    private library library;

    @Before
    public void setUp() {
        library = new library();
    }

    @Test
    public void testAddBookSuccessfully() {
        library.addBook("978-0134685991", "Effective Java", "Joshua Bloch",2018);
        assertEquals("Effective Java", library.getBooks().get("978-0134685991").getTitle());
        assertEquals("Joshua Bloch", library.getBooks().get("978-0134685991").getAuthor());
    }
    @Test
    public void testAddDuplicateBook() {
        library.addBook("978-0134685991", "Effective Java", "Joshua Bloch", 2018);
        library.addBook("978-0134685991", "Effective Java", "Joshua Bloch", 2018);
        assertEquals(1, library.getBooks().size()); 
    }

    @Test
    public void testAddMultipleBooks() {
        library.addBook("978-0134685991", "Effective Java", "Joshua Bloch", 2018);
        library.addBook("978-0596009205", "Head First Java", "Kathy Sierra", 2005);
        assertEquals(2, library.getBooks().size());
    }

    @Test
    public void testAddBookInvalidISBN() {
        
        library.addBook("", "Some Book", "Some Author", 2024);
        assertNull(library.getBooks().get(""));  
    }
   
}
