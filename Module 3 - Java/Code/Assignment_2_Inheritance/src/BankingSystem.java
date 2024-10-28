/*Problem Statement 4: Banking System
Description:
Design a class hierarchy for a banking system. Create a base class Account with attributes like accountNumber, accountHolderName, 
and balance. Derive two subclasses, SavingsAccount and CurrentAccount, from Account. 
The SavingsAccount should have an interest rate and methods for depositing, withdrawing, and calculating interest, 
while the CurrentAccount should include attributes for overdraft limit and methods for managing funds.
Implement methods to display account details and to perform transactions.
*/

class Account {
	int Accountno;
	String Name;
	Float balance;
	static Float Total_balance = 0f;

	public Account(int accountno, String name, Float balance) {
		this.Accountno = accountno;
		this.Name = name;
		this.balance = balance;
	}

	void display() {
		System.out.println("Account No Is : " + Accountno);
		System.out.println("Account holder name is : " + Name);
		System.out.println(Name + " Bank Balance is  " + balance);

	}

	void totalbalance() {
		System.out.println("Total Balance is : " + Total_balance);
	}

}

class SavingAccount extends Account {
	Float ir;

	public SavingAccount(int accountno, String name, Float balance, Float ir) {
		super(accountno, name, balance);
		this.ir = ir;
	}

	void displayir() {
		System.out.println("Interest rate is : " + ir * 100 + "%");
	}

	void calculateint() {
		Float intamount = balance * ir;
		System.out.println(intamount);
		balance = balance + intamount;
		Total_balance = Total_balance + balance;
	}

}

class currentAccount extends Account {
	static Float overdraftlimit;

	public currentAccount(int accountno, String name, Float balance, Float overdraftlimit) {
		super(accountno, name, balance);
		this.overdraftlimit = overdraftlimit;
	}

	void display() {
		System.out.println("The over draft limit is : "+overdraftlimit);
	}
}

public class BankingSystem {
	public static void main(String[] args) {
		SavingAccount s1 = new SavingAccount(1001, "shan", 30000f, 0.05f);
		s1.display();
		s1.displayir();
		s1.calculateint();
		s1.totalbalance();

		System.out.println("---------------------------");
		  currentAccount s2 = new currentAccount(1002,"ishan",5000f, 10000f);
		  s2.display(); 
		  s2.totalbalance();
	}
	
	

}
