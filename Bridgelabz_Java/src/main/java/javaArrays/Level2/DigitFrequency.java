package javaArrays.Level2;
import java.util.Arrays;
import java.util.Scanner;
public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int tempNumber = number;
        int digitCount = 0;
        while (tempNumber != 0) {
            tempNumber = tempNumber / 10;
            digitCount++;
        }
        int[] digits = new int[digitCount];
        tempNumber = number;
        for (int i = 0; i < digitCount; i++) {
            digits[i] = tempNumber % 10;
            tempNumber = tempNumber / 10;
        }
        int[] frequency = new int[10];
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++;
        }
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Frequency: " + Arrays.toString(frequency));
    }
}