package Inheritance.Employee;
// Class to represent an intern who inherits from Employee
public class Intern extends Employee {
    String collegeName;
    public Intern(String name, int id, double salary, String collegeName) {
        super(name, id, salary);
        this.collegeName = collegeName;
    }
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("College Name: " + collegeName);
    }
}