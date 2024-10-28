/*2. Problem Statement: Employee Management System
Objective: Create an employee management system that manages different employee roles
(e.g., Manager, Engineer, and Intern). Each role should provide its own method to calculate bonuses.

Logic-Building Method for Overriding:
Superclass Definition: Define a superclass Employee with a method calculateBonus().
Subclass Specialization: Implement subclasses (Manager, Engineer, Intern) that override calculateBonus() 
to implement role-specific bonus calculations.
Dynamic Binding: Use an array of Employee references to calculate bonuses for different roles using polymorphism.*/

class Employee 
{
	String Eid;
	String Ename;
	int salary;
	
	public Employee(String eid, String ename, int salary) {
	
		this.Eid = eid;
		this.Ename = ename;
		this.salary = salary;
	}
	
	void display() 
	{
		System.out.println("Employee id is : " + Eid);
		System.out.println("Employee name is : " + Ename);
		System.out.println("Employee salary is : " + salary);
	}
	
	void calculateBonus() 
	{
		System.out.println("Bonus is : " );
	}
	
}
class Manager extends Employee
{

	public Manager(String eid, String ename, int salary) 
	{
		super(eid, ename, salary);
	
	}
	void calculateBonus() 
	{
		System.out.println("Manager Bonus is : " + salary * 0.2 );
		System.out.println("------------------------------------------------");
	}	
}
class Engineer extends Employee
{

	public Engineer(String eid, String ename, int salary) 
	{
		super(eid, ename, salary);
	
	}
	void calculateBonus() 
	{
		System.out.println("Engineer Bonus is : " + salary * 0.15 );
		System.out.println("------------------------------------------------");
	}	
}
class Intern extends Employee
{

	public Intern(String eid, String ename, int salary) 
	{
		super(eid, ename, salary);
	
	}
	void calculateBonus() 
	{
		System.out.println("Intern Bonus is : " + salary * 0.05);
		System.out.println("------------------------------------------------");
	}	
}

public class bonus_calc 
{

	public static void main(String[] args) 
	{
		Employee[] e = new Employee[3];
		e[0] = new Manager("101", "Tim", 15000);
		e[1] = new Engineer("102", "Vikram", 12000);
		e[2] =  new Intern("201", "Paul", 5000);
		for(int i = 0; i<3; i++) 
		{
			e[i].display();
			e[i].calculateBonus();
		}
	}

}
