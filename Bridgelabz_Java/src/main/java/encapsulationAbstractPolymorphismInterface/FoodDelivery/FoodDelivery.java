package encapsulationAbstractPolymorphismInterface.FoodDelivery;
import java.util.ArrayList;
// Class to process food orders using encapsulation and polymorphism
public class FoodDelivery {
    // To process different food items using one method
    public static void processOrder(FoodItem item) {
        item.getItemDetails();
        double totalPrice = item.calculateTotalPrice();
        double discount = item.applyDiscount();
        double finalPrice = totalPrice - discount;
        System.out.println("Total Price: " + totalPrice);
        System.out.println("Discount: " + discount);
        System.out.println("Final Price: " + finalPrice);
        System.out.println(item.getDiscountDetails());
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayList<FoodItem> order = new ArrayList<>();
        order.add(new VegItem("Paneer Rice", 150, 2));
        order.add(new NonVegItem("Chicken Biryani", 250, 1));
        for (FoodItem item : order) {
            processOrder(item);
        }
    }
}