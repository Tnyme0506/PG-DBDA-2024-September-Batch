/*
4. Problem Statement: Online Course Management System
Objective: Build a system that manages different course types (e.g., LiveCourse, RecordedCourse, and Workshop).
Each course type should provide its own method to calculate enrollment fees.

Logic-Building Method for Overriding:
Superclass Structure: Define a superclass Course with a method calculateEnrollmentFee().
Subclass Implementation: Implement subclasses (LiveCourse, RecordedCourse, Workshop) that override calculateEnrollmentFee()
to specify different fee structures.
Fee Calculation: Maintain a list of Course objects and use polymorphism to calculate and display enrollment fees.
*/
class Course{
    String course_name;
    int hours;

    public Course(String course_name, int hours){
        this.course_name = course_name;
        this.hours = hours;
    }
    double calculateEnrollmentFee() {
        return 0;
    }
    void display(){
        System.out.println("Course Name is: " + course_name);
        System.out.println("Course Duration is: " + hours + " hours");
    }
}
class LiveCourse extends Course{
    int fee_per_hour;
    public LiveCourse(String course_name, int hours, int fee_per_hour){
        super(course_name,hours);
        this.fee_per_hour = fee_per_hour;
    }

    @Override
    double calculateEnrollmentFee() {
        return hours * fee_per_hour;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Fee per Hour is: " + fee_per_hour);
    }
}
class RecordedCourse extends Course{
    double course_price;
    public RecordedCourse(String course_name, int hours, double course_price){
        super(course_name,hours);
        this.course_price = course_price;
    }

    @Override
    double calculateEnrollmentFee() {
        return course_price;
    }

    @Override
    void display() {
        super.display();
    }
}
class Workshop extends Course{
    int workshopFee;
    int materials_price;
    public Workshop(String course_name, int hours, int workshopFee,int materials_price){
        super(course_name,hours);
        this.workshopFee = workshopFee;
        this.materials_price = materials_price;
    }

    @Override
    double calculateEnrollmentFee() {
        return workshopFee + materials_price;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Fee for Workshop is: " + workshopFee);
        System.out.println("Price of Materials is: " + materials_price);
    }
}

public class Fee_Calculation {
    public static void main(String[] args) {
        Course[] c = new Course[3];
        c[0] = new LiveCourse("Big Data Analysis",900,150);
        c[1] = new RecordedCourse("Google Data Analyst Certification",200,4000);
        c[2] = new Workshop("Engineering Workshop",140,50000,25000);
        for(int i =0; i<3; i++){
            c[i].display();
            System.out.println("Total Fees for "+c[i].course_name+" is: " + c[i].calculateEnrollmentFee());
            System.out.println("--------------------------------------");
        }
    }
}
