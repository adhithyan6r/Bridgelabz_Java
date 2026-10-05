package thisStaticFinal;
// Class to manage university students using static, this, final and instanceof
public class Student {
    static String universityName = "ABC University";
    static int totalStudents = 0;
    String name;
    final int rollNumber;
    String grade;
    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }
    public static void displayTotalStudents() {
        System.out.println("Total Students: " + totalStudents);
    }
    public void updateGrade(String grade) {
        this.grade = grade;
    }
    public void displayDetails() {
        System.out.println("University: " + universityName);
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }
    public static void main(String[] args) {
        Student student = new Student("Adhi", 101, "A");
        if (student instanceof Student) {
            student.updateGrade("A+");
            student.displayDetails();
        }
        Student.displayTotalStudents();
    }
}