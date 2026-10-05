package Inheritance.Restaurant;
// Class to run the restaurant management program
public class RestaurantManagement {
    public static void main(String[] args) {
        Chef chef = new Chef("Kiruthick", 35, "Italian");
        Waiter waiter = new Waiter("Adhi", 25, 5);

        chef.displayDetails();
        System.out.println();

        waiter.displayDetails();
    }
}