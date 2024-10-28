import java.util.Scanner;

/*
Contact Management System:

Problem Statement: Design a Contact class with attributes for name, phone number, and email.
Create methods to read contact details, display all contacts, and a logic method to find a contact by name.
Logic Method: find_contact(name) - Searches for and returns the contact details based on the provided name.
*/
public class Contact
{
    String name;
    String phone_number;
    String email;
    static int num;
    static Scanner s = new Scanner(System.in);
    public Contact(String name,String phone_number,String email){
        this.name = name;
        this.phone_number = phone_number;
        this.email = email;
    }
    public static Contact[] read_details(){
        System.out.println("Number of Contacts: ");
        num = s.nextInt();
        Contact[] contact = new Contact[num];
        for(int i = 0; i < num ; i++)
        {
            s.nextLine();
            System.out.println("Details of Contact " + (i+1) + ": ");
            System.out.println("Name: ");
            String name = s.nextLine();
            System.out.println("Contact Number: ");
            String cont_num = s.next();
            System.out.println("Email: ");
            String email = s.next();
            contact[i] = new Contact(name, cont_num,email);
        }
        return contact;
    }
    public static void display(Contact[] cont) {
        System.out.println("Contact Book: ");
        for(int i = 0 ; i < num ; i++)
        {
            System.out.println("Entry "+(i+1));
            System.out.println("Name: " + cont[i].name);
            System.out.println("Phone Number: " + cont[i].phone_number);
            System.out.println("Email: " + cont[i].email);
        }
    }
    public static void find_contact(Contact[] cont){
        boolean count = false;
        System.out.println("Enter the name: ");
        s.nextLine();
        String name = s.nextLine();
        for(int i = 0 ; i < num ; i++)
        {
            if (cont[i].name.equals(name)) {
                System.out.println("Name: " + cont[i].name);
                System.out.println("Phone Number: " + cont[i].phone_number);
                System.out.println("Email: " + cont[i].email);
                count = true;
            }
            if (!count)
                System.out.println("No Matches Found");

        }
    }
    public static void main(String[] args) {
        Contact[] input = read_details();
        display(input);
        find_contact(input);
     }
}
