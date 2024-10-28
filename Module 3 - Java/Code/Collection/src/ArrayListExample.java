import java.util.*;

class Student
{
    int student_id;
    String name;
    int marks;

    public Student(int student_id, String name, int marks)
    {
        this.student_id = student_id;
        this.name = name;
        this.marks = marks;
    }
    void display(){
        System.out.println("Student ID: " + student_id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Marks: " + marks);
        System.out.println("-------------------------------------");
    }
}
class Methods
{
    static Scanner sc = new Scanner(System.in);
    public ArrayList<Student> CreateArrayList() {
        ArrayList<Student> al = new ArrayList<>();
        int choice;
        do {
            System.out.println("Enter Student ID: ");
            int id = sc.nextInt();
            System.out.println("Enter Student Name: ");
            String name = sc.next();
            System.out.println("Enter Student Marks: ");
            int marks = sc.nextInt();
            Student s = new Student(id,name,marks);
            al.add(s);
            System.out.println("Make a Choice: \n1. Add another student record \n2.Exit");
            choice = sc.nextInt();
        }while (choice !=2);
        return al;
    }
    public void displayArrayList(ArrayList<Student> al){
        for(Student s: al){
            System.out.println("Marks List: ");
            s.display();
        }
    }
    public void updateObject(ArrayList<Student> al){
        int choice;
        do {
            System.out.println("Do you want to Update Student's Marks? \n1.Yes \n2. No");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter Student ID: ");
                    int id = sc.nextInt();
                    System.out.println("Enter New Marks: ");
                    int marks = sc.nextInt();
                    for (Student stud : al){
                        if(stud.student_id == id)
                            stud.marks = marks;
                    }
                    break;
                case 2:
                    break;
            }
        }while (choice !=2);
    }
    public void deleteObject(ArrayList<Student> al){
        int choice;
        do {
            System.out.println("Do you want to Delete Student's Record? \n1.Yes \n2. No");
            choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Enter Student ID: ");
                    int id = sc.nextInt();
                    int index = 0;
                    for (Student stud : al){
                        if(stud.student_id == id)
                            index = al.indexOf(stud);
                    }
                    System.out.println(index);
                    al.remove(index);
                    break;
                case 2:
                    break;
            }
        }while (choice !=2);
    }
}

public class ArrayListExample
{
    public static void main(String[] args) {
        Methods m = new Methods();
        ArrayList<Student> al = m.CreateArrayList();
        m.displayArrayList(al);
        m.updateObject(al);
        m.displayArrayList(al);
        m.deleteObject(al);
        m.displayArrayList(al);
    }
}
