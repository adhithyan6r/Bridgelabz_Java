package javaMethods.Level2;
import java.util.Scanner;
// Problem: Check whether 10 students are eligible to vote based on their age.
public class CanStudentVote {
    // Method used to check whether a student can vote
    public boolean canStudentVote(int age) {
        return age >= 18;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CanStudentVote checker = new CanStudentVote();
        for (int i = 1; i <= 10; i++) {
            // Input: Take the student's age from the user
            System.out.print("Enter age of student " + i + ": ");
            int age = scanner.nextInt();
            if (age < 0) {
                System.out.println("Invalid age");
            } else if (checker.canStudentVote(age)) {
                System.out.println("Student " + i + " can vote");
            } else {
                System.out.println("Student " + i + " cannot vote");
            }
        }
    }
}