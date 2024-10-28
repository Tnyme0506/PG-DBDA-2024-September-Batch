/*
Expense Tracker:

Problem Statement: Create an Expense class with attributes for description, amount, and category.
Implement methods to read expense entries, display all expenses,
and a logic method to calculate the total expenses for a specific category.
Logic Method: total_expenses(category) - Sums the amounts of expenses belonging to the specified category.
*/
import java.util.Scanner;
public class Expense {
    String description;
    int amount;
    String category;
    static int num;
    static Scanner s  = new Scanner(System.in);

    public Expense(String description, int amount, String category){
        this.description = description;
        this.amount = amount;
        this.category = category;
    }
    public static Expense[] read_entries(){
        System.out.println("Number of Entries: ");
        num = s.nextInt();
        Expense[] exp = new Expense[num];
        for(int i =0 ; i< num ; i++){
            s.nextLine();
            System.out.println("Enter Description for Expense "+(i+1)+" :");
            String desc = s.nextLine();
            System.out.println("Enter Amount for Expense "+(i+1)+" :");
            int amount = s.nextInt();
            System.out.println("Enter Category for Expense "+(i+1) +" :");
            String category = s.next();
            exp[i] = new Expense(desc, amount, category);
        }
        return exp;
    }
    public static void display(Expense[] exp){
        for(int i =0; i < num; i++){
            System.out.println("Expense "+(i+1)+"details: ");
            System.out.println("Description: "+ exp[i].description);
            System.out.println("Amount: "+ exp[i].amount);
            System.out.println("Category: " + exp[i].category);

        }
    }
    public static void total_expenses(Expense[] exp,String category){
        int total_amount = 0;
        for(int i =0 ; i < num ; i++){
            if ( exp[i].category.equals(category))
                total_amount = total_amount + exp[i].amount;
        }
        System.out.println("Total Expenses for "+ category +" is: " + total_amount);
    }
    public static void main(String[] args) {
        Expense[] input = read_entries();
        display(input);
        System.out.println("Select the Category: ");
        String cat = s.next();
        total_expenses(input,cat);
    }
}
