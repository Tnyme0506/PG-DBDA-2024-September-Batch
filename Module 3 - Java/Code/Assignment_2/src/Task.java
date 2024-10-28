/*To-Do List Application:
Problem Statement: Build a Task class with attributes for task name, 
due date, and status. Implement methods to read task details from the user, display the task list, 
and a logic method to check if the task is overdue.
Logic Method: is_overdue() - Checks if the current date exceeds the due date.
*/
package Assignment3_classobject;
import java.util.*;
public class Task 
{
	String task_name;
	int due_date;
	String status;
	
	public void read_data() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Task Name: ");
		this.task_name = sc.next();
		System.out.println("Enter Due Date: ");
		this.due_date = sc.nextInt();
		this.status = is_overdue();
		sc.close();
	}
	
	public String is_overdue() 
	{
		Scanner sc = new Scanner(System.in);
		int current = 0;
		String outcome;
		System.out.println("Enter Current Date: ");
		current = sc.nextInt();
		if (current > this.due_date) 
			outcome = "Overdue";
		else
			outcome = "Not Overdue";
			
		return outcome;
	}
	
	public void display() 
	{
		System.out.println("Task Details");
		System.out.println("Task name: "+this.task_name);
		System.out.println("Due Date: "+ this.due_date);
		System.out.println("Status : " + this.status);
		
	}
	public static void main(String[] args) 
	{
		Task t = new Task();
		t.read_data();
		t.display();
		
	}
}
