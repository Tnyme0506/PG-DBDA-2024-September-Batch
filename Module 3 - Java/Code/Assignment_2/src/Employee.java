import java.util.Scanner;

/*
Employee:

Problem Statement: Design an Employee class with attributes for name, position, and salary.
Implement methods to read employee details, display the employee information,
and a logic method to determine if the employee is eligible for a bonus based on salary.
Logic Method: is_eligible_for_bonus() - Returns true if the salary exceeds a specified threshold (e.g., $50,000).
*/
public class Employee
{
    String name;
    String position;
    int salary;
    static int num;
    static Scanner s = new Scanner(System.in);
    public Employee(String name, String position, int salary){
        this.name = name;
        this.position = position;
        this.salary = salary;
    }
    public static Employee[] read_details() {
        System.out.println("Number of Employees: ");
        num = s.nextInt();
        Employee[] employee = new Employee[num];
        for (int i = 0; i < num; i++) {
            s.nextLine();
            System.out.println("Details of Employee " + (i + 1) + ": ");
            System.out.println("Name: ");
            String name = s.nextLine();
            System.out.println("Position: ");
            String position = s.next();
            System.out.println("Salary: ");
            int salary = s.nextInt();
            employee[i] = new Employee(name, position, salary);
        }
        return employee;
    }
    public static void display(Employee[] emp) {
        System.out.println("Employee Records: ");
        for(int i = 0 ; i < num ; i++)
        {
            System.out.println("Entry "+(i+1));
            System.out.println("Name: " + emp[i].name);
            System.out.println("Position: " + emp[i].position);
            System.out.println("Salary: " + emp[i].salary);
            boolean bonus = is_eligible_for_bonus(emp[i].salary);
            System.out.println("Eligible for Bonus: " + bonus);
        }
    }
    public static boolean is_eligible_for_bonus(int sal){
        return sal > 10000;
    }
    public static void main(String[] args) {
        Employee[] input = read_details();
        display(input);
    }
}
