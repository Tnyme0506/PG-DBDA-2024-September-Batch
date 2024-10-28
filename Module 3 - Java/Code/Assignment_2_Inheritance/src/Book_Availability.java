/*
Problem Statement 5: Library Management
Description:
Create a library management system using hierarchical inheritance.
Develop a base class Book with common attributes like title, author, and isbn.
Derive two subclasses, EBook and PrintedBook.
The EBook class should include additional attributes such as fileSize and downloadLink,
while the PrintedBook class should have pageCount and shelfLocation.
Implement methods to display book details and to check availability based on the type of book.
*/

class Book {
    String title;
    String author;
    String isbn;
    boolean available;

    public Book(String title, String author, String isbn, boolean available) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.available = available;
    }

    public boolean isAvailable() {
        return available;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
        System.out.println("Availability: " + (available ? "Available" : "Not Available"));
    }
}
class EBook extends Book {
    // Additional attributes for EBook
    double fileSize; // In MB
    String downloadLink;
    public EBook(String title, String author, String isbn, boolean available, double fileSize, String downloadLink) {
        super(title, author, isbn, available);
        this.fileSize = fileSize;
        this.downloadLink = downloadLink;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("File Size: " + fileSize + " MB");
        System.out.println("Download Link: " + downloadLink);
    }
}

class PrintedBook extends Book {
    int pageCount;
    String shelfLocation;
    public PrintedBook(String title, String author, String isbn, boolean available, int pageCount, String shelfLocation) {
        super(title, author, isbn, available);
        this.pageCount = pageCount;
        this.shelfLocation = shelfLocation;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Page Count: " + pageCount);
        System.out.println("Shelf Location: " + shelfLocation);
    }
}
public class Book_Availability {
    public static void main(String[] args) {
        EBook ebook = new EBook("Digital Fortress", "Dan Brown", "9780552161251", true, 2.5, "www.ebooks.com/fortress");
        PrintedBook printedBook = new PrintedBook("Angels and Demons", "Dan Brown", "9780743493468", false, 616, "Aisle 3, Shelf B");
        System.out.println("EBook Details:");
        ebook.displayDetails();
        System.out.println();
        System.out.println("Printed Book Details:");
        printedBook.displayDetails();
    }
}
