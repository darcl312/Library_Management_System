package com.mycompany.library_management_system;



import java.util.Scanner;

 public class LibraryManagementSystem {
 
     public static void main(String[] args) {
         library library = new library();
         Scanner scanner = new Scanner(System.in);
         boolean exit = false;
 
         while (!exit) {
             System.out.println("\nLibrary Management System");
             System.out.println("1. Add Book");
             System.out.println("2. View Available Books");
             System.out.println("3. Borrow Book");
             System.out.println("4. Return Book");
             System.out.println("5. Exit");
             System.out.print("Choose an option: ");
             int choice = scanner.nextInt();
             scanner.nextLine();  // Consume newline
 
             switch (choice) {
                 case 1: // Add a book
                     System.out.print("Enter ISBN: ");
                     String isbn = scanner.nextLine();
                     System.out.print("Enter Title: ");
                     String title = scanner.nextLine();
                     System.out.print("Enter Author: ");
                     String author = scanner.nextLine();
                     System.out.print("Enter Year of Publication: ");
                     int year = scanner.nextInt();
 
                     
 
                 case 2: // View available books
                     System.out.println("Available Books:");
                 
                     break;
 
                 case 3: // Borrow a book
                     System.out.print("Enter ISBN to borrow: ");
                     isbn = scanner.nextLine();
                    
                     break;
 
                 case 4: // Return a book
                     System.out.print("Enter ISBN to return: ");
                     isbn = scanner.nextLine();
                    
                     break;
 
                 case 5: // Exit
                     exit = true;
                     break;
 
                 default:
                     System.out.println("Invalid option. Please try again.");
                     break;
             }
         }
 
         scanner.close();
     }
 }
 
