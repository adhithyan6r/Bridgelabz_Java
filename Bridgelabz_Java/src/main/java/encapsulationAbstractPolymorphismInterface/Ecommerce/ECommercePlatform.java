package encapsulationAbstractPolymorphismInterface.Ecommerce;
import java.util.ArrayList;
// Class to run the e-commerce platform program
public class ECommercePlatform {
    public static void displayFinalPrice(Product product) {
        double price = product.getPrice();
        double discount = product.calculateDiscount();
        double tax = ((Taxable) product).calculateTax();
        double finalPrice = price + tax - discount;
        System.out.println("Product: " + product.getName());
        System.out.println("Original Price: " + price);
        System.out.println("Discount: " + discount);
        System.out.println("Tax: " + tax);
        System.out.println("Final Price: " + finalPrice);
        System.out.println(((Taxable) product).getTaxDetails());
        System.out.println();
    }
    public static void main(String[] args) {
        Electronics electronics =
                new Electronics(101, "Laptop", 50000);
        Clothing clothing =
                new Clothing(102, "Jacket", 5000);
        Groceries groceries =
                new Groceries(103, "Rice", 1000);
        ArrayList<Product> products = new ArrayList<>();
        products.add(electronics);
        products.add(clothing);
        products.add(groceries);
        for (Product product : products) {
            displayFinalPrice(product);
        }
    }
}