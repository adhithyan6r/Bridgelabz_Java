package thisStaticFinal;
// Class to manage shopping products using static, this, final and instanceof
public class Product {
    static double discount = 10;
    String productName;
    double price;
    int quantity;
    final int productID;
    public Product(String productName, double price, int quantity, int productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }
    public void displayDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Product ID: " + productID);
        System.out.println("Discount: " + discount + "%");
    }
    public static void main(String[] args) {
        Product product = new Product("Laptop", 50000, 2, 101);
        Product.updateDiscount(15);
        if (product instanceof Product) {
            product.displayDetails();
        }
    }
}