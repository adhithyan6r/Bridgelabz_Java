package classAndObject.Level2;
import  java.util.Scanner;
//To find the grade of student and print their details
public class Student {
    String name = "";
    int rollNumber  = 0;
    int marks = 0;
    String grade = "";
    public String gradeCheck(int marks){
        if (marks>90){
            return "A";
        } else if (marks>80) {
            return "B";
        } else if (marks>70) {
            return "C";
        } else if (marks>60) {
            return "D";
        } else{
            return "F";
        }
    }

    public void display(){
        System.out.println("Student Name : " + name);
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Marks Scored : "+marks);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student1 = new Student();
        System.out.println("Enter Student name :");
        student1.name = scanner.nextLine();
        System.out.println("Enter roll number:");
        student1.rollNumber = scanner.nextInt();
        System.out.println("Enter marks :");
        student1.marks = scanner.nextInt();
        student1.display();
        String gradeOfStudent = student1.gradeCheck(student1.marks);
        System.out.println("Grade of Student is: "+gradeOfStudent);

    }

}
