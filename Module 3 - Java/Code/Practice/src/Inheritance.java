/*
Problem Statement 4: Banking System
Description:
Design a class hierarchy for a banking system.
Create a base class Account with attributes like accountNumber, accountHolderName, and balance.
Derive two subclasses, SavingsAccount and CurrentAccount, from Account.
The SavingsAccount should have an interest rate and methods for depositing, withdrawing,and calculating interest,
while the CurrentAccount should include attributes for overdraft limit and methods for managing funds.
Implement methods to display account details and to perform transactions.
*/

import java.util.Scanner;

class Account{
    double accountNumber;
    String accountHolderName;
    float balance;
    public Account(double accountNumber, String accountHolderName, float balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    void Display(){
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}
class SavingsAccount extends Account {
    float interest;
    static Scanner sc = new Scanner(System.in);
    public SavingsAccount(double accountNumber, String accountHolderName, float balance,float interest) {
        super(accountNumber, accountHolderName, balance);
        this.interest = interest;
    }
    void Deposit(){
        System.out.println("Enter the amount to deposit: ");
        int deposit = sc.nextInt();
        if (deposit > 0) {
            balance = balance + deposit;
            System.out.println(deposit + " deposited to account");
        }
        else
            System.out.println("Enter Valid Amount");

    }
    void Withdraw(){
        System.out.println("Enter the amount to Withdraw: ");
        float withdraw = sc.nextFloat();
        if (balance > withdraw){
            balance = balance - withdraw;
            System.out.println(withdraw + " withdrawn from account");
        }
        else if (balance < withdraw) {
            System.out.println("Insufficient Balance");
        }
        else
            System.out.println("Enter Valid Amount");
    }
    void Interest(){
        System.out.println("Interest amount is: " + (balance * interest / 100));
    }
    void Display(){
        super.Display();
        System.out.println("Interest Rate is: "+ interest);
    }
}
class CurrentAccount extends Account {
    double overdraftLimit;
    static Scanner sc = new Scanner(System.in);

    public CurrentAccount(double accountNumber, String accountHolderName, float balance, double overdraftLimit) {
        super(accountNumber, accountHolderName, balance);
        this.overdraftLimit = overdraftLimit;
    }
    public void withdraw() {
        System.out.println("Enter the amount to Withdraw: ");
        float withdraw = sc.nextFloat();
        if (withdraw> 0 && (balance + overdraftLimit) >= withdraw) {
            balance -= withdraw;
            System.out.println("Withdrew: " + withdraw);
            System.out.println("New Balance: " + balance);
        } else {
            System.out.println("Insufficient funds or exceeds overdraft limit.");
        }
    }
    public void Display() {
        super.Display();
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // Savings Account
        SavingsAccount sa = new SavingsAccount(1545145,"Naveen",15000,4);
        sa.Deposit();
        sa.Withdraw();
        sa.Interest();
        sa.Display();
        // Current Account
        CurrentAccount ca = new CurrentAccount(142145,"Shreya",14500,10000);
        ca.withdraw();
        ca.Display();
    }
}
