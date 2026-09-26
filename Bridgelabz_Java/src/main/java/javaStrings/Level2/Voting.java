package javaStrings.Level2;
import java.util.Scanner;
// Problem: take the age of 10 students and check whether they can vote
public class Voting{
    // Method to check the voting eligibility of each student
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] >= 18) {
                result[i][1] = "Can Vote";
            } else {
                result[i][1] = "Cannot Vote";
            }
        }
        return result;
    }
    // Method to display the string array
    public static void displayStudents(String[][] result) {
        System.out.println("\nAge\tVoting Eligibility");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t" + result[i][1]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // take input of 10 students
        int[] ages = new int[10];
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
        }
        String[][] result = checkVotingEligibility(ages);
        displayStudents(result);
    }
}