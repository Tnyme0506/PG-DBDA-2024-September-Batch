/*Student Attendance Tracker:
Problem Statement: Design a Student class with attributes for name and attendance records. 
Create methods to read student details, display attendance for the month, 
and a logic method to calculate the percentage of classes attended.
Logic Method: attendance_percentage() - Computes the percentage of attended classes based on total classes.
*/

package Assignment3_classobject;
import java.util.*;

public class Student 
{
	String name;
	int attendance_record;
	static int total_classes = 80;
	
	// Constructor
	public Student(String name, int attendance_record) {
		 this.name = name;
	     this.attendance_record = attendance_record;
	}
	// Giving Input
	public static Student[] readstudentdetails() 
	{
		Student student[] = new Student[2];
		Scanner s = new Scanner(System.in);
		for (int i =0; i<2 ; i++) {
			System.out.println("Enter name and attendance of Student  "+ (i+1));
			String name1 = s.nextLine();
			int attendance = s.nextInt();
			s.nextLine(); 
			student[i] = new Student(name1, attendance);
		}
		
		return student;
	}
	// Display Students
	public static void display(Student[] student) 
	{
		for (int i =0; i<2; i++) {
			String name = student[0].name;
			System.out.println("Student Name is "+ student[i].name);
			System.out.println("Student Attendance Record is "+student[i].attendance_record+"/"+total_classes);
			int percent = student[i].attendance_record * 100 / total_classes;
			System.out.println("Attendance Percentage is "+percent+"%");
		}
	}

	public static void main(String[] args) 
	{
		Student[] input = readstudentdetails();
		display(input);
	
		
	}

}
