/*
Problem Statement 1: Employee Management System
Description:
Design a class hierarchy for an Employee Management System. The base class Employee should include attributes 
such as employeeId, name, and department. 
Create two subclasses, FullTimeEmployee and PartTimeEmployee, which inherit from Employee. 
The FullTimeEmployee class should have additional attributes like salary, while the PartTimeEmployee class should include hourlyRate. 
Implement methods to calculate total compensation for both types of employees.
*/
class Employee
{
	int employeeId; 
	String name;
	String department;
	
	public Employee(int employeeId, String name, String department) 
	{
		this.employeeId = employeeId;
		this.name = name;
		this.department = department;
	}
	
	public void displayemp() 
	{
		System.out.println(employeeId);
		System.out.println(name);
		System.out.println(department);
	}
}

class FullTimeEmployee extends Employee
{
	int salary;

	public FullTimeEmployee(int employeeId, String name, String department, int salary) 
	{
		super(employeeId, name, department);
		this.salary = salary;
	}
	
}

class PartTimeEmployee extends Employee
{
	int hourlyRate;
	int year_sal;

	public PartTimeEmployee(int employeeId, String name, String department, int hourlyRate) 
	{
		super(employeeId, name, department);
		this.hourlyRate = hourlyRate;
		this.year_sal = hourlyRate * 40 * 52;
	}
}


public class Total_compensation {

	public static void comp(int money) 
	{
		System.out.println("Comp. is : " + money/10);
	}
	
	
	public static void main(String[] args) 
	{
		FullTimeEmployee f = new FullTimeEmployee(101, "Tim", "Sales", 500000);
		comp(f.salary);
		PartTimeEmployee p = new PartTimeEmployee(201, "kim", "Freelancer", 20);
		comp(p.year_sal);
				
	}

}
