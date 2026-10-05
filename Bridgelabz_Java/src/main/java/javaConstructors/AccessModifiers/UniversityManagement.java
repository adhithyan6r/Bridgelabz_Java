package javaConstructors.AccessModifiers;
// Class to manage student details and demonstrate access modifiers
class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
    public double getCGPA() {
        return CGPA;
    }
}
// Class to demonstrate protected member access
class PostgraduateStudent extends Student {
    public void display() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCGPA());
    }
}
// Class to run the university management program
public class UniversityManagement {
    public static void main(String[] args) {
        PostgraduateStudent student = new PostgraduateStudent();
        student.rollNumber = 101;
        student.name = "Adhi";
        student.setCGPA(8.5);
        student.display();
    }
}