import java.util.HashMap;
import java.util.Scanner;
import java.util.Map.Entry;

class Product {
    String productID;
    String productName;
    int quantity;

    // Constructor to initialize product details
    public Product(String productID, String productName, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.quantity = quantity;
    }

    // Display method to print the product details
    void Display() {
        System.out.println(productID + "\n" + productName + "\n" + quantity);
    }
}

class Methods1 {
    Scanner sc = new Scanner(System.in);

    // Method to add products to the inventory
    public HashMap<String, Product> ProductDetails() {
        System.out.println("Number of products to Add: ");
        int num = sc.nextInt();
        HashMap<String, Product> hm = new HashMap<>();
        for (int i = 0; i < num; i++) {
            System.out.println("Enter the product id: ");
            String id = sc.next();
            System.out.println("Enter the product Name: ");
            String name = sc.next();
            System.out.println("Enter the product qty: ");
            int qty = sc.nextInt();

            Product p = new Product(id, name, qty);
            hm.put(id, p);
        }
        return hm;
    }

    // Method to update the quantity of an existing product
    public void UpdateProduct(HashMap<String, Product> hm) {
        System.out.println("Enter the Product ID: ");
        String id = sc.next();
        System.out.println("Enter the quantity: ");
        int qty = sc.nextInt();
        Product obj = hm.get(id);
        obj.quantity = qty;
        System.out.println("Quantity updated");
    }

    // Method to remove a product from the inventory
    public void RemoveProduct(HashMap<String, Product> hm) {
        System.out.println("Enter the Product ID: ");
        String id = sc.next();
        hm.remove(id);
        System.out.println("Product Removed");
    }

    // Method to display all products in the inventory
    public void Display(HashMap<String, Product> hm) {
        for (Entry<String, Product> m : hm.entrySet()) {
            m.getValue().Display();
            System.out.println("-------------------------");
        }
    }

    // Method to display inventory in a formatted way
    public void DisplayInventory(HashMap<String, Product> hm) {
        for (Entry<String, Product> m : hm.entrySet()) {
            System.out.println("Product: " + m.getValue().productName + "   Qty: " + m.getValue().quantity);
            System.out.println("-------------------------");
        }
    }

    // Menu to select operations
    public int Menu() {
        int choice;
        System.out.println("Select your Action: ");
        System.out.println("1. Add new products to the inventory ");
        System.out.println("2. Update the quantity of a product based on its product ID ");
        System.out.println("3. Remove a product from the inventory ");
        System.out.println("4. Display the stock levels for all products ");
        System.out.println("5. Display All ");
        System.out.println("6. EXIT");

        choice = sc.nextInt();
        return choice;
    }
}

public class InventoryManagement {
    public static void main(String[] args) {
        Methods1 m = new Methods1();
        int choice ;
        HashMap<String, Product> hm = new HashMap<>();
        do {
            choice = m.Menu();
            switch (choice) {
                case 1:
                    hm = m.ProductDetails();
                    break;
                case 2:
                    m.UpdateProduct(hm);
                    break;
                case 3:
                    m.RemoveProduct(hm);
                    break;
                case 4:
                    m.DisplayInventory(hm);
                    break;
                case 5:
                    m.Display(hm);
                    break;
                case 6:
                    break;
            }
        } while (choice != 6);
    }
}
