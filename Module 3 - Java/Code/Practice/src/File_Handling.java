import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/*
Problem Statement: Student Information Management System

Scenario: A university wants to maintain a record of its students using a text file.
Each student has the following attributes: studentID, name, department, GPA, and enrollmentDate. Your task is to implement a Java application that performs the following operations using object-oriented principles:

Write: Add new student records to the file.
Update: Modify the details of an existing student based on studentID.
Delete: Remove a student record from the file based on studentID.
Business Logic: Implement a method that calculates the average GPA of all students.
Implement a Java program that uses file handling to perform the read and write operations. The program should include:

A Student class to represent individual student records.
A StudentManager class to handle file operations and business logic.
*/
class Student implements Serializable{
    int studentID;
    String studentName;
    String course;
    float GPA;

    public Student(int studentID, String studentName, String course, float GPA) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.course = course;
        this.GPA = GPA;
    }

    void Display(){
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + studentName);
        System.out.println("Course Enrolled: " + course);
        System.out.println("GPA: " + GPA);
    }
}
class StudentManager{
    static Scanner sc = new Scanner(System.in);
    ArrayList<Student> al = new ArrayList<>();
    void CreateFile() throws IOException, ClassNotFoundException {
        File f = new File("student.txt");
        FileInputStream fis ;
        if (!f.exists()) {
            f.createNewFile();

        }
        else {
            fis = new FileInputStream(f);
            ObjectInputStream ois = new ObjectInputStream(fis);
            al = (ArrayList<Student>) ois.readObject();
        }

    }

    void UploadToFile_Append() throws IOException {
        FileOutputStream fos = new FileOutputStream("student.txt",true);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(al);
        oos.close();
    }
    void UploadToFile_Overwrite() throws IOException {
        FileOutputStream fos = new FileOutputStream("student.txt",false);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(al);
        oos.close();
    }
    void EnterData() throws IOException {
        System.out.println("Enter Student ID: ");
        int id = sc.nextInt();
        System.out.println("Enter Student Name: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.println("Enter Course Enrolled: ");
        String course = sc.nextLine();
        System.out.println("Enter GPA: ");
        float gpa = sc.nextFloat();
        Student s =new Student(id,name,course,gpa);
        al.add(s);
        UploadToFile_Overwrite();
        System.out.println("Student Record Added");
    }
    void UpdateData() throws IOException {
        System.out.println("Enter Student ID: ");
        int id = sc.nextInt();
        System.out.println("Enter the Field you wish to modify: \n1. Student Name \n2. Student Course \n3. Student GPA");
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice){
            case 1:
                System.out.println("Enter New Name: ");
                String name = sc.nextLine();
                for(Student s: al){
                    if(s.studentID == id)
                        s.studentName = name;
                }
                System.out.println("Name Updated");
                break;
            case 2:
                System.out.println("Enter New Course: ");
                String course = sc.nextLine();
                for(Student s: al){
                    if(s.studentID == id)
                        s.course= course;
                }
                System.out.println("Course Updated");
                break;
            case 3:
                System.out.println("Enter New GPA: ");
                float gpa = sc.nextFloat();
                for(Student s: al){
                    if(s.studentID == id)
                        s.GPA = gpa;
                }
                System.out.println("Name Updated");
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
        UploadToFile_Overwrite();
    }
    void DeleteData() throws IOException {
        System.out.println("Enter Student ID: ");
        int id = sc.nextInt();
        int pos = 0;
        for (Student s: al){
            if (s.studentID == id)
                pos = al.indexOf(s);
        }
        al.remove(pos);
        System.out.println("Record Deleted");
        UploadToFile_Overwrite();
    }
    void AverageGpa(){
        float gpa = 0;
        float number = 0;
        for (Student s: al){
            gpa = gpa + s.GPA;
            number = number + 1;
        }
        float avg = gpa/number;
        System.out.println("Average GPA is " + avg);
    }
    void Display(){
        for (Student s: al){
            s.Display();
            System.out.println("------------------------------------");
        }
    }
    void Menu() throws IOException {
        System.out.println("Welcome to Student Management Portal");
        int choice;
        do {
            System.out.println(  "Enter your choice of action " +
                             "\n1. Enter a Record \n2. Update Record \n3. Delete a Record \n4. Show Average GPA  \n5. Show all Records \n6. Exit");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    EnterData();
                    break;
                case 2:
                    UpdateData();
                    break;
                case 3:
                    DeleteData();
                    break;
                case 4:
                    AverageGpa();
                    break;
                case 5:
                    Display();
                    break;
                case 6:
                    break;
            }
        } while (choice !=6);
    }

}
public class File_Handling {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        StudentManager sm = new StudentManager();
        sm.CreateFile();
        sm.Menu();
    }
}
