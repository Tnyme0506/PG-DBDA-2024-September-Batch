/* Problem Statement: Library Management System
Objective: Develop a library management system that categorizes different types of books (e.g., Fiction, Non-Fiction, and Reference). 
Each book type should have its own method to display borrowing rules.*/

package Assignment2Overriding;

public class LibraryM 
{
		String title;
	    String author;
	    int yearPublished;
		public LibraryM(String title, String author, int yearPublished) 
		{
			this.title = title;
			this.author = author;
			this.yearPublished = yearPublished;
		}
		void displaybook() 
		{
			System.out.println("Title of Book is: " + title);
			System.out.println("Author: "+ author);
			System.out.println("Year Published: " + yearPublished);
		}
		void borrowingrules() 
		{
			System.out.println("No Rules for this");
		}
}

class Fiction extends LibraryM
{
	public Fiction(String title, String author, int yearPublished)
	{
		super(title, author, yearPublished);
		
	}
	void borrowingrules() 
	{
		System.out.println("Allowed to borrow for 'One' Week");
		System.out.println("-----------------------------------");
	}
}

class Non_fiction extends LibraryM
{
	public Non_fiction(String title, String author, int yearPublished)
	{
		super(title, author, yearPublished);
		
	}
	
	
	void borrowingrules() 
	{
		System.out.println("Allowed to borrow for 'Two' Weeks");
		System.out.println("-----------------------------------");
	}
}

class Reference extends LibraryM
{
	public Reference(String title, String author, int yearPublished)
	{
		super(title, author, yearPublished);
		
	}
	
	void borrowingrules() 
	{
		System.out.println("Not Allowed to Borrow");
		System.out.println("-----------------------------------");
	}
}

class LibraryManagementSystem {
    public static void main(String[] args) {
        // Creating instances of different book types
    	LibraryM l;
    	l = new Fiction("The Great Gatsby", "F. Scott Fitzgerald", 1925);
    	l.displaybook();
    	l.borrowingrules();
    	
    	l = new Non_fiction("Sapiens: A Brief History of Humankind", "Yuval Noah Harari", 2011);
    	l.displaybook();
    	l.borrowingrules();
    	
    	l = new Reference("Encyclopedia Britannica", "Various", 2020);
    	l.displaybook();
    	l.borrowingrules();
    	

    }
}