package javaMethods.Level3;
import java.util.Scanner;
// Problem: Generate PCM scores for students and calculate their total, average, and percentage.
public class Marks{
    // Method to generate random two-digit PCM scores for all students
    public static int[][] generateScores(int numberOfStudents) {
        int[][] scores = new int[numberOfStudents][3];
        for (int i = 0; i < numberOfStudents; i++) {
            scores[i][0] = 10 + (int) (Math.random() * 90);
            scores[i][1] = 10 + (int) (Math.random() * 90);
            scores[i][2] = 10 + (int) (Math.random() * 90);
        }
        return scores;
    }
    // Method: to calculate total, average, and percentage for each student
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = (double) total / 3;
            double percentage = (double) total / 300 * 100;
            // Round average and percentage to two decimal places
            average = Math.round(average * 100.0) / 100.0;
            percentage = Math.round(percentage * 100.0) / 100.0;
            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }
        return results;
    }
    // Method to display the scorecard in tabular format.
    public static void displayScorecard(
            int[][] scores,
            double[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%d\t%.2f\t%.2f%%%n",
                    i + 1,
                    scores[i][0],
                    scores[i][1],
                    scores[i][2],
                    (int) results[i][0],
                    results[i][1],
                    results[i][2]
            );
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input: for number of stuudents
        System.out.print("Enter number of students: ");
        int numberOfStudents = scanner.nextInt();
        int[][] scores = generateScores(numberOfStudents);
        double[][] results = calculateResults(scores);
        displayScorecard(scores, results);
    }
}