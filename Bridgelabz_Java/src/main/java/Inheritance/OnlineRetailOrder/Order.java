package Inheritance.OnlineRetailOrder;
// Class to represent common details of an order
public class Order {
    int orderId;
    String orderDate;
    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }
    public void getOrderStatus() {
        System.out.println("Order Status: Order Placed");
    }
}