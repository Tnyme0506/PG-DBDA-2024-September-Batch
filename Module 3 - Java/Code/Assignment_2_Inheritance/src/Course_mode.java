/*
Problem Statement 3: University Course Management
Description:
Build a class hierarchy for a university course management system.
The base class Course should contain attributes like courseCode, courseName, and credits.
Create two subclasses, OnlineCourse and OnCampusCourse, that inherit from Course.
The OnlineCourse should have a platform attribute, while the OnCampusCourse should include classroomNumber.
Implement methods to display course information and to determine the mode of delivery.
*/

class Course {
    int courseCode;
    String courseName;
    int credits;

    public Course(int courseCode, String courseName, int credits){
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.credits = credits;
    }
    void display() {
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Credits: " + credits);
    }
}
class OnlineCourse extends Course {
    int platform_attribute;
    public OnlineCourse(int courseCode, String courseName, int credits, int platform_attribute){
        super(courseCode, courseName, credits);
        this.platform_attribute = platform_attribute;
    }
    @Override
    void display() {
        super.display();
        System.out.println("Mode of Delivery: Online");
        System.out.println("Platform Attribute is: " + platform_attribute);
        System.out.println("----------------------------------------------");
    }
}
class OnCampusCourse extends Course{
    int classroomNumber;
    public OnCampusCourse(int courseCode, String courseName, int credits, int classroomNumber){
        super(courseCode, courseName, credits);
        this.classroomNumber = classroomNumber;
    }
    @Override
    void display() {
        super.display();
        System.out.println("Mode of Delivery: Offline");
        System.out.println("Classroom Number is: " + classroomNumber);
        System.out.println("----------------------------------------------");
    }
}


public class Course_mode {
    public static void main(String[] args) {
        Course c;
        c = new OnlineCourse(101,"Physics",10,1541);
        c.display();
        c = new OnCampusCourse(102,"Chemistry",10,205);
        c.display();

    }
}
