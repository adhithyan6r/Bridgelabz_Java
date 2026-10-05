package Inheritance.SchoolSystem;
// Class to represent a student who inherits from Person
public class Student extends Person {
    String grade;
    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }
    public void displayRole() {
        System.out.println("Role: Student");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
    }
}