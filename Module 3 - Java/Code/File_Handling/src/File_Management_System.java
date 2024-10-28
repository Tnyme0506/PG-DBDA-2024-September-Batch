import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
Menu Options:
1: Create a new file for storing book records.
2: Write a new book record (append to the file).
3: Read all book records from the file.
4: Update a specific book record (by searching by title).
5: Delete a specific book record (by searching by title).
*/
class file_methods2{
    static Scanner sc = new Scanner(System.in);
    // Create a new file
    void Create_file(){
        System.out.println("Enter File Name: ");
        String f_name = sc.next();
        File f = new File(f_name);
        try {
            if(f.createNewFile())
                System.out.println("File Created");
            else
                System.out.println("File Already Exists");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    // Write to the File
    void Write_file(){
        System.out.println("Enter File Name: ");
        String f_name = sc.next();
        try {
            FileWriter fw = new FileWriter(f_name,true);
            BufferedWriter writer = new BufferedWriter(fw);
            System.out.println("Write Book Name: ");
            String book_name = sc.next();
            writer.write(book_name + "\n");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    void Menu() {
        int choice;
        do {
            System.out.println("Enter your Choice \n1. Create a File \n2. Write to the File \n3. Exit");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    Create_file();
                    break;
                case 2:
                    Write_file();
                    break;
                case 3:
                    break;
            }


        } while (choice != 3);
    }
}
public class File_Management_System {
    public static void main(String[] args) {
        file_methods2 m2 = new file_methods2();
        m2.Menu();
    }
}
