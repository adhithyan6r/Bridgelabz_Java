package Inheritance.SchoolSystem;
// Class to represent a staff member who inherits from Person
public class Staff extends Person {
    public Staff(String name, int age) {
        super(name, age);
    }
    public void displayRole() {
        System.out.println("Role: Staff");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}