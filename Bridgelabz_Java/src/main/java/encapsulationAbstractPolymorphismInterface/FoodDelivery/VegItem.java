package encapsulationAbstractPolymorphismInterface.FoodDelivery;
// Class to represent vegetarian food items
public class VegItem extends FoodItem {
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }
    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }
    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.05;
    }
    @Override
    public String getDiscountDetails() {
        return "Vegetarian item discount: 5%";
    }
}