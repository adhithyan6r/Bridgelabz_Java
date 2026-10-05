package Inheritance.OnlineRetailOrder;
// Class to represent a shipped order that inherits from Order
public class ShippedOrder extends Order {
    String trackingNumber;
    public ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }
    @Override
    public void getOrderStatus() {
        System.out.println("Order Status: Order Shipped");
        System.out.println("Tracking Number: " + trackingNumber);
    }
}