package javaStrings.Level2;
import java.util.Scanner;

// Problem: Take marks of students in Physics, Chemistry, and Maths, calculate percentage and grade.
public class Grade{
    // Method to take random marks for Physics, Chemistry, and Maths
    public static int[][] generateMarks(int numberOfStudents) {
        int[][] marks = new int[numberOfStudents][3];
        for (int i = 0; i < numberOfStudents; i++) {
            marks[i][0] = (int) (Math.random() * 91) + 10;
            marks[i][1] = (int) (Math.random() * 91) + 10;
            marks[i][2] = (int) (Math.random() * 91) + 10;
        }
        return marks;
    }
    // to calculate total, average, and percentage.
    public static double[][] calculateResults(int[][] marks) {
        double[][] results = new double[marks.length][3];
        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = (double) total / 3;
            double percentage = (double) total / 300 * 100;
            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }
    // Method to calculate grade based on percentage
    public static String[][] calculateGrade(double[][] results) {
        String[][] grades = new String[results.length][1];
        for (int i = 0; i < results.length; i++) {
            double percentage = results[i][2];
            if (percentage >= 80) {
                grades[i][0] = "A";
            } else if (percentage >= 70) {
                grades[i][0] = "B";
            } else if (percentage >= 60) {
                grades[i][0] = "C";
            } else if (percentage >= 50) {
                grades[i][0] = "D";
            } else if (percentage >= 40) {
                grades[i][0] = "E";
            } else {
                grades[i][0] = "R";
            }
        }
        return grades;
    }
    // Method to display the student scorecard.
    public static void displayScorecard(
            int[][] marks,
            double[][] results,
            String[][] grades) {
        System.out.println("\nStudent Scorecard");
        System.out.println(
                "Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade"
        );
        for (int i = 0; i < marks.length; i++) {
            System.out.println(
                    (i + 1) + "\t"
                            + marks[i][0] + "\t"
                            + marks[i][1] + "\t\t"
                            + marks[i][2] + "\t"
                            + (int) results[i][0] + "\t"
                            + results[i][1] + "\t"
                            + results[i][2] + "%\t\t"
                            + grades[i][0]
            );
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input: Take the number of students
        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();
        int[][] marks = generateMarks(numberOfStudents);
        double[][] results = calculateResults(marks);
        String[][] grades = calculateGrade(results);
        displayScorecard(marks, results, grades);
    }
}