package com.mycompany.library_management_system;



import com.mycompany.library_management_system.library;
import com.mycompany.library_management_system.LibraryManagementSystem;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class LibraryManagementSystemTest {

    private library  library;

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        library = new library();
        library.addBook("978-0134685991", "Effective Java", "Joshua Bloch", 2018);
        library.addBook("978-0596009205", "Head First Java", "Kathy Sierra", 2005);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testViewAvailableBooks() {
        library.viewAvailableBooks();
        assertEquals(2, library.getBooks().size()); 
    }

}
