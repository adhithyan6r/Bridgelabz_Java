package Inheritance.Restaurant;
// Class to represent a waiter who inherits from RestaurantPerson and implements Worker
public class Waiter extends Person implements Worker {
    int tableNumber;
    public Waiter(String name, int age, int tableNumber) {
        super(name, age);
        this.tableNumber = tableNumber;
    }
    @Override
    public void performDuties() {
        System.out.println("Waiter is serving customers");
    }
    public void displayDetails() {
        System.out.println("Role: Waiter");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Table Number: " + tableNumber);
        performDuties();
    }
}