/*
5. Problem Statement: E-Commerce Payment System
Objective: Develop an e-commerce system that handles various payment methods (e.g., CreditCardPayment, PayPalPayment, and GiftCardPayment).
Each payment method should implement its own processing logic.
Logic-Building Method for Overriding:
Common Superclass: Create a superclass Payment with a method processPayment().
Subclass Specialization: Create subclasses (CreditCardPayment, PayPalPayment, GiftCardPayment)
                         that override processPayment() to implement unique processing logic for each payment method.
Payment Processing: Use a list of Payment references to process payments and demonstrate overridden behaviors.
*/

class Bank{
    String bank_name;
    double amount;
    public Bank(String bank_name, double amount){
        this.bank_name = bank_name;
        this.amount = amount;
    }
    double processPayment(){
        return 0;
    }
    void display(){
        System.out.println("Bank Name: " + bank_name);
        System.out.println("Amount Paid: " + amount);
    }
}
class CreditPayment extends Bank{
    public CreditPayment(String bank_name, double amount){
        super(bank_name,amount);
    }
    @Override
    double processPayment() {
        return amount * 0.025;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Payment Type: Credit Card");
        System.out.println("Processing Fee is: " + processPayment());
        System.out.println("Total Payment Amount is: " + (amount + processPayment()));
    }
}
class PayPalPayment extends Bank{
    public PayPalPayment(String bank_name, double amount){
        super(bank_name,amount);
    }

    @Override
    double processPayment() {
        return amount * 0.03;
    }
    void display() {
        super.display();
        System.out.println("Payment Type: PayPal");
        System.out.println("Processing Fee is: " + processPayment());
        System.out.println("Total Payment Amount is: " + (amount + processPayment()));
    }
}
class GiftCardPayment extends Bank{
    double giftCardAmount;
    public GiftCardPayment(String bank_name, double amount, double giftCardAmount){
        super(bank_name, amount);
        this.giftCardAmount = giftCardAmount;
    }

    @Override
    double processPayment() {
        return giftCardAmount - amount;
    }
    void display() {
        super.display();
        System.out.println("Payment Type: Gift Card");
        System.out.println("Gift Card Value is: " + giftCardAmount);
        System.out.println(("Remaining Amount is: " + processPayment()));
    }
}
public class Processing {
    public static void main(String[] args) {
        Bank[] b = new Bank[3];
        b[0] = new CreditPayment("State Bank of India",1540000);
        b[1] = new PayPalPayment("H.D.F.C",14000);
        b[2] = new GiftCardPayment("New India Bank", 50000,100000);
        for(Bank bank: b){
            bank.display();
            System.out.println("-------------------------------------------");
        }

    }
}
