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

   
}
