import java.io.*;
import java.util.Scanner;

class file_methods1
{
    static Scanner sc = new Scanner(System.in);
    void input(){
        sc.nextLine();
        System.out.println("Write the Line: ");
        String line = sc.nextLine();
        FileWriter fw;
        {
            try {
                fw = new FileWriter("practice",true);
                BufferedWriter writer = new BufferedWriter(fw);
                writer.write(line + "\n");
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    void output(){
        FileReader fr ;
        try {
            fr = new FileReader("practice");
            BufferedReader reader = new BufferedReader(fr);
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    int Menu(){
        System.out.println("Enter your Choice \n1. Write a Line to File \n2. Read the File \n3. Exit");
        return sc.nextInt();
    }
}

public class Practice
{
    public static void main(String[] args) {
        file_methods1 fm = new file_methods1();

        int choice;
        do {
            choice = fm.Menu();
            switch (choice){
                case 1:
                    fm.input();
                    break;
                case 2:
                    fm.output();
                case 3:
                    break;
            }
        } while(choice != 3);
    }
}
