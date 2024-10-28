import java.util.HashMap;

public class HashMap_Ex {
    public static void main(String[] args) {
        HashMap<Integer, Student> hm = new HashMap<>();
        Student s1 = new Student(1, "Alice Johnson", "Computer Science", 3.8f);
        Student s2 = new Student(2, "Bob Smith", "Mechanical Engineering", 3.6f);
        Student s3 = new Student(3, "Charlie Brown", "Electrical Engineering", 3.9f);
        Student s4 = new Student(4, "Diana Prince", "Civil Engineering", 3.5f);
        Student s5 = new Student(5, "Ethan Clark", "Business Management", 3.7f);
        hm.put(s1.studentID, s1);
        hm.put(s2.studentID,s2);
        hm.put(s3.studentID,s3);
        hm.put(s4.studentID,s4);
        hm.put(s5.studentID,s5);
        for(int s : hm.keySet()){

            hm.get(s).Display();
            System.out.println("-----------------------------------");
        }

    }
}
