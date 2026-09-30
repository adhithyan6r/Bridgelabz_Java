package classAndObject.Level2;
import java.util.Scanner;
// Class to manage cart items, their quantities, and total cost
public class ShoppingCart {
    String itemName = "";
    double price = 0;
    int quantity = 0;
    public void addItem(int amount) {
        if (amount > 0) {
            quantity += amount;
            System.out.println("Item added");
        } else {
            System.out.println("Invalid quantity");
        }
    }
    public void removeItem(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid quantity");
        } else if (amount <= quantity) {
            quantity -= amount;
            System.out.println("Item removed");
        } else {
            System.out.println("Insufficient quantity in cart");
        }
    }
    public void displayTotal() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + (price * quantity));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ShoppingCart item = new ShoppingCart();
        System.out.print("Enter item name: ");
        item.itemName = scanner.nextLine();
        System.out.print("Enter item price: ");
        item.price = scanner.nextDouble();
        if (item.price <= 0) {
            System.out.println("Invalid item price");
            return;
        }
        System.out.print("Enter quantity to add: ");
        item.addItem(scanner.nextInt());
        System.out.println("1. Add item");
        System.out.println("2. remove item");
        System.out.println("3. Display total");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter quantity to add: ");
                item.addItem(scanner.nextInt());
                break;
            case 2:
                System.out.print("Enter quantity to remove: ");
                item.removeItem(scanner.nextInt());
                break;
            case 3:
                item.displayTotal();
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}