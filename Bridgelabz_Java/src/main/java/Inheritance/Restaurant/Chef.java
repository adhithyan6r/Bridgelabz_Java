package Inheritance.Restaurant;
// Class to represent a chef who inherits from RestaurantPerson and implements Worker
public class Chef extends Person implements Worker {
    String speciality;
    public Chef(String name, int age, String speciality) {
        super(name, age);
        this.speciality = speciality;
    }
    @Override
    public void performDuties() {
        System.out.println("Chef is preparing food");
    }
    public void displayDetails() {
        System.out.println("Role: Chef");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Speciality: " + speciality);
        performDuties();
    }
}