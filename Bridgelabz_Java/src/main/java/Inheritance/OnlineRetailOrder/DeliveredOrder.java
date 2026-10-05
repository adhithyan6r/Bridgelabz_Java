package Inheritance.OnlineRetailOrder;
// Class to represent a delivered order that inherits from ShippedOrder
public class DeliveredOrder extends ShippedOrder {
    String deliveryDate;
    public DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }
    @Override
    public void getOrderStatus() {
        System.out.println("Order Status: Order Delivered");
        System.out.println("Tracking Number: " + trackingNumber);
        System.out.println("Delivery Date: " + deliveryDate);
    }
}