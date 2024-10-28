/*
Problem 4: Course Registration System using HashMap
Objective: Develop a system to manage student registrations for different courses,
where each course has a course code, course name, and a list of enrolled students.

Problem Statement: Create a Course class with the following attributes:

courseCode (String)
courseName (String)
enrolledStudents (ArrayList<String>)
Use a HashMap<String, Course> to manage courses, where the key is the courseCode and the value is the Course object.
The program should support the following operations:

Add a new course.
Register a student for a course.
Display all students enrolled in a particular course.
Remove a student from a course.
*/
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Course{
    String courseCode;
    String courseName;
    ArrayList<String> enrolledStudents;

    public Course(String courseCode, String courseName, ArrayList<String> enrolledStudents){
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
    }
    void Display(){
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Name: " + courseName);
        System.out.println("Students Enrolled: ");
        for(String stud: enrolledStudents){
            int i = 1;
            System.out.println(i + ". " + stud);
        }
    }
}
class CourseMethods{
    Scanner sc = new Scanner(System.in);
    // Add a new course.
    public HashMap<String, Course> AddCourse(){
        HashMap<String , Course> hm = new HashMap<>();
        ArrayList<String> es = new ArrayList<>();
        System.out.println("Enter Course Code: ");
        String code = sc.next();
        System.out.println("Enter Course Name: ");
        String name = sc.next();
        System.out.println("Number of Students Enrolled: ");
        int stud_num = sc.nextInt();
        for (int i = 0; i < stud_num; i++){
            System.out.println("Enter Student " + (i+1) +" name: ");
            String stud_name = sc.next();
            es.add(stud_name);
        }
        Course c = new Course(code,name,es);
        hm.put(code,c);
        System.out.println("Course Added");
        return hm;
    }
    // Register a student for a course.
    public void AddStudent(HashMap<String,Course> hm){
        System.out.println("Enter Course Code: ");
        String code = sc.next();
        System.out.println("Enter New Student Name: ");
        String stud_name = sc.next();
        ArrayList<String> es;
        es = hm.get(code).enrolledStudents;
        es.add(stud_name);
        System.out.println("Student Added");
    }
    // Remove a student from a course.
    public void RemoveStudent(HashMap<String,Course> hm){
        System.out.println("Enter Course Code: ");
        String code = sc.next();
        System.out.println("Enter New Student Name: ");
        String stud_name = sc.next();
        ArrayList<String> es;
        es = hm.get(code).enrolledStudents;
        int pos = 0;
        for(String s: es){
            if(s.equals(stud_name)){
                pos = es.indexOf(s);
            }
        }
        es.remove(pos);
        System.out.println("Student Removed");
    }
    // Display all students enrolled in a particular course.
    public void DisplayStudents(HashMap<String,Course> hm){
        for(Map.Entry<String,Course> e : hm.entrySet()){
            e.getValue().Display();
            System.out.println("--------------------------------");
        }
    }

    // Menu to select operations
    public int Menu() {
        int choice;

        System.out.println("Select your Action: ");
        System.out.println("1. Add a new course. ");
        System.out.println("2. Register a student for a course. ");
        System.out.println("3. Display all students enrolled in a particular course.");
        System.out.println("4. Remove a student from a course. ");
        System.out.println("5. EXIT");

        choice = sc.nextInt();
        return choice;
    }
}

public class CourseRegistration {
    public static void main(String[] args) {
        HashMap<String,Course> hm = new HashMap<>();
        CourseMethods cm = new CourseMethods();
        int choice;
        do {
           choice = cm.Menu();
           switch (choice){
               case 1:
                   hm = cm.AddCourse();
                   break;
               case 2:
                   cm.AddStudent(hm);
                   break;
               case 3:
                   cm.DisplayStudents(hm);
                   break;
               case 4:
                   cm.RemoveStudent(hm);
                   break;
               case 5:
                   break;
           }
        }while (choice != 5);
    }

}
