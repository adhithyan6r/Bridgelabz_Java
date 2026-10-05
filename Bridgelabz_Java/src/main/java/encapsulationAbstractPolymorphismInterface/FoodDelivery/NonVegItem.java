package encapsulationAbstractPolymorphismInterface.FoodDelivery;
// Class to represent non-vegetarian food items
public class NonVegItem extends FoodItem {
    private double additionalCharge = 50;
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }
    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + additionalCharge;
    }
    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.10;
    }
    @Override
    public String getDiscountDetails() {
        return "Non-vegetarian item discount: 10%";
    }
}