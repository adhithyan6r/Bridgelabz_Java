package Inheritance.OnlineRetailOrder;
// Class to run the online retail order management program
public class OrderManagement {
    public static void main(String[] args) {
        Order order = new Order(101, "05-10-2026");
        ShippedOrder shippedOrder = new ShippedOrder(102, "05-10-2026", "TRK12345");
        DeliveredOrder deliveredOrder = new DeliveredOrder(103, "04-10-2026", "TRK67890", "05-10-2026");
        order.getOrderStatus();
        System.out.println();
        shippedOrder.getOrderStatus();
        System.out.println();
        deliveredOrder.getOrderStatus();
    }
}