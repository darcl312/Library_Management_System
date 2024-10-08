
package com.mycompany.library_management_system;


    public class Book {

        private String isbn;
        private String title;
        private String author;
        private int publicationYear;
        private boolean isBorrowed;
    
        public Book(String isbn, String title, String author, int publicationYear) {
            this.isbn = isbn;
            this.title = title;
            this.author = author;
            this.publicationYear = publicationYear;
            this.isBorrowed = false;
        }
    
        public String getIsbn() {
            return isbn;
        }
        
    
        public String getTitle() {
            return title;
        }
    
        public String getAuthor() {
            return author;
        }
    
        public int getPublicationYear() {
            return publicationYear;
        }
    
        public boolean isBorrowed() {
            return isBorrowed;
        }
    
        public void borrow() {
            if (isBorrowed) {
                throw new IllegalStateException("Book is already borrowed.");
            }
            isBorrowed = true;
        }
    
        public void returnBook() {
            isBorrowed = false;
        }
    
        @Override
        public String toString() {
            return title + " by " + author + " (ISBN: " + isbn + ", Year: " + publicationYear + ")";
        }
    }
    
    

