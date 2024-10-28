import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/*
Problem Statement: Employee Management System
Scenario:
A company wants to maintain a record of its employees using a text file.
Each employee has the following attributes: employeeID, name, department, salary, and joinDate.
Your task is to implement a Java application that performs the following operations using object-oriented principles:

Write:  Add new employee records to the file.
Update: Modify the details of an existing employee based on employeeID.
Delete: Remove an employee record from the file based on employeeID.
Business Logic: Implement a method that calculates the total salary expenditure of all employees.

Implement a Java program that uses file handling to perform the read and write operations. The program should include:

An Employee class to represent individual employee records.
An EmployeeManager class to handle file operations and business logic.

Sample Implementation Outline

1. Employee Class:
Attributes: employeeID, name, department, salary, joinDate.
Constructor and methods to get and set attributes.

2. EmployeeManager Class:
Methods to perform operations:

Write: Add a new employee record to the file.
Update: Update an employee's details based on employeeID.
Delete: Remove an employee record based on employeeID.
Business logic method to calculate the total salary expenditure.
*/

class Employee implements Serializable{
    int employeeID;
    String name;
    String department;
    double salary;

    public Employee(int employeeID, String name, String department, double salary){
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    void Display(){
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee's Department Name: " + department);
        System.out.println("Employee's Salary: " + salary);
    }
}
class EmployeeManager{
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Employee> al = new ArrayList<>();

    public void loadEmployees() throws IOException, ClassNotFoundException {
        File file = new File("Employee_Records.dat");
        if (file.exists()) {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
            al = (ArrayList<Employee>) ois.readObject();
        }
    }
    public void File_write_append() throws IOException {
        FileOutputStream fw = new FileOutputStream("Employee_Records.dat",true);
        ObjectOutputStream oos = new ObjectOutputStream(fw);
        oos.writeObject(al);
        oos.close();
        fw.close();
    }
    public void File_write_overwrite() throws IOException {
        FileOutputStream fw = new FileOutputStream("Employee_Records.dat",false);
        ObjectOutputStream oos = new ObjectOutputStream(fw);
        oos.writeObject(al);
        oos.close();
        fw.close();
    }
    public void Add_emp() throws IOException {
        System.out.println("Record of Employee");
        System.out.println("Enter Employee ID: ");
        int id = sc.nextInt();
        System.out.println("Enter Employee Name: ");
        String name = sc.next();
        System.out.println("Enter Department Name: ");
        String dept = sc.next();
        System.out.println("Enter Employee's Salary: ");
        double sal = sc.nextDouble();
        Employee e = new Employee(id,name,dept,sal);
        System.out.println("Emp Object Created");
        al.add(e);
        File_write_append();
        System.out.println("Emp record written to File ^_^");
    }

    public void Update_emp() throws IOException {
        System.out.println("Enter Employee ID: ");
        int id = sc.nextInt();
        System.out.println("Field to Update");
        System.out.println("1. Employee Name");
        System.out.println("2. Employee's Department");
        System.out.println("3. Employee's Salary");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Enter New Name: ");
                String new_name = sc.next();
                for(Employee e: al){
                    if(e.employeeID == id)
                        e.name = new_name;
                }
                break;
            case 2:
                System.out.println("Enter New Department: ");
                String new_dept = sc.next();
                for(Employee e: al){
                    if(e.employeeID == id)
                        e.department = new_dept;
                }
                break;
            case 3:
                System.out.println("Enter New Salary: ");
                double new_sal = sc.nextDouble();
                for(Employee e: al){
                    if(e.employeeID == id)
                        e.salary = new_sal;
                }
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
        File_write_overwrite();
        System.out.println("File Updated");
    }
    public void Remove_emp() throws IOException {
        System.out.println("Enter Employee ID: ");
        int id = sc.nextInt();
        Employee emp =null;
        for(Employee e: al){
            if(e.employeeID == id)
                emp = e;
        }
        al.remove(emp);
        System.out.println("Employee Removed");
        File_write_overwrite();
        System.out.println("File Updated");
    }
    public void Total_sal() {
        double total_sal = 0;
        for(Employee e : al){
            total_sal = total_sal + e.salary;
        }
        System.out.println("Total Salary Expenditure is " + total_sal + " Rupees");
    }
    public void Emp_Display() {
        System.out.println(al);
        for (Employee e:al){
            System.out.println("Record of Employee");
            e.Display();
            System.out.println("-----------------------------------------------");
        }
    }

    int Menu() {
        int choice;
        System.out.println("Enter your Choice " +
                "\n1. Add new employee records to the file. " +
                "\n2. Modify the details of an existing employee based on employeeID." +
                "\n3. Remove an employee record from the file based on employeeID." +
                "\n4. Total salary expenditure of all employees" +
                "\n5. Display All Records" +
                "\n6. EXIT");
        choice = sc.nextInt();

        return choice;
    }
}
public class Employee_Management_System {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        EmployeeManager em = new EmployeeManager();
        int choice;
        em.loadEmployees();
        do{
            choice = em.Menu();
            switch (choice){
                case 1:
                    em.Add_emp();
                    break;
                case 2:
                    em.Update_emp();
                    break;
                case 3:
                    em.Remove_emp();
                    break;
                case 4:
                    em.Total_sal();
                    break;
                case 5:
                    em.Emp_Display();
                    break;
                case 6:
                    break;
            }
        } while (choice != 6);
    }
}

