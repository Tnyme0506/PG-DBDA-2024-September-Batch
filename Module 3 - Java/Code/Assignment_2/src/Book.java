/*Library Book Inventory:

Problem Statement: Create a Book class with attributes like title, author, and ISBN.
Implement methods to read book details from user input, display all book information,
and a logic method to check if a book is available based on its status.
Logic Method: is_available() - Returns true if the book is not currently checked out.*/

import java.util.Scanner;

public class Book {
    String title;
    String author;
    String ISBN;
    boolean is_available;

    public void read_book_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Book Title: ");
        this.title = sc.nextLine();
        System.out.println("Enter Author Name: ");
        this.author = sc.nextLine();
        System.out.println("Enter ISBN: ");
        this.ISBN = sc.nextLine();
        this.is_available = is_available();

    }

    public boolean is_available(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Is the Book Available: \n 1. Available \n 2. Not Available");
        int choice = sc.nextInt();
        if (choice == 1)
            return true;
        else if (choice == 2)
            return false;
        else{
            System.out.println("Please Enter either 1 or 2");
            return is_available();
        }
    }

    public void display_book_details(){
        String status = (is_available ? "Not Checked Out" : "Checked Out");
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Status: "+status);
    }

    public static void main(String[] args){
        Book new_book = new Book();
        new_book.read_book_details();
        new_book.display_book_details();
    }
}

