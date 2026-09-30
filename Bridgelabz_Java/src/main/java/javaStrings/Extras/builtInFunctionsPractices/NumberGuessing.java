package javaStrings.Extras.builtInFunctionsPractices;
import java.util.Scanner;
import java.util.Random;
//Program used to guess the users number by asking higher or lower feedbacks
public class NumberGuessing {
    //randrom guess
    public static int generateGuess(int low, int high) {
        Random random = new Random();
        return random.nextInt(high - low + 1) + low;
    }//getting feedback from user
    public static String getFeedback(Scanner scanner, int guess) {
        System.out.println("My guess is: " + guess);
        System.out.print("Enter high, low, or correct: ");
        return scanner.nextLine().toLowerCase();
    }
    public static int getNextGuess(int low, int high, String feedback, int guess) {
        if (feedback.equals("low")) {
            return guess + 1;
        } else if (feedback.equals("high")) {
            return guess - 1;
        }
        return guess;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int low = 1;
        int high = 100;
        while (low <= high) {
            int guess = generateGuess(low, high);
            String feedback = getFeedback(scanner, guess);
            if (feedback.equals("correct")) {
                System.out.println("I guessed your number");
                break;
            } else if (feedback.equals("low")) {
                low = getNextGuess(low, high, feedback, guess);
            } else if (feedback.equals("high")) {
                high = getNextGuess(low, high, feedback, guess);
            } else {
                System.out.println("Invalid feedback");
            }
        }
        if (low > high) {
            System.out.println("eedback is inconsistent");
        }
    }
}