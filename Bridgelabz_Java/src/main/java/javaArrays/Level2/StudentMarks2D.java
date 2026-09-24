package javaArrays.Level2;
import java.util.Arrays;
import java.util.Scanner;
public class StudentMarks2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int number = scanner.nextInt();
        double[][] marks = new double[number][3];
        double[] percentage = new double[number];
        String[] grade = new String[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Student " + (i + 1));
            System.out.print("Physics marks: ");
            marks[i][0] = scanner.nextDouble();
            System.out.print("Chemistry marks: ");
            marks[i][1] = scanner.nextDouble();
            System.out.print("Maths marks: ");
            marks[i][2] = scanner.nextDouble();
            if (marks[i][0] < 0 || marks[i][1] < 0 || marks[i][2] < 0) {
                System.out.println("Invalid marks");
                i--;
                continue;
            }
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3;
            if (percentage[i] >= 80) {
                grade[i] = "A";
            } else if (percentage[i] >= 70) {
                grade[i] = "B";
            } else if (percentage[i] >= 60) {
                grade[i] = "c";
            } else if (percentage[i] >= 50) {
                grade[i] = "D";
            } else if (percentage[i] >= 40) {
                grade[i] = "E";
            } else {
                grade[i] = "R";
            }
        }
        System.out.println("Marks: " + Arrays.deepToString(marks));
        System.out.println("Percentage: " + Arrays.toString(percentage));
        System.out.println("Grade: " + Arrays.toString(grade));
    }
}