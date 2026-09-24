package javaArrays.Level2;
import java.util.Arrays;
import java.util.Scanner;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int temp = number;
        int digitCount = 0;
        while (temp != 0) {
            temp = temp / 10;
            digitCount++;
        }
        int[] digits = new int[digitCount];
        int[] reverseDigits = new int[digitCount];
        temp = number;
        for (int i = 0; i < digitCount; i++) {
            digits[i] = temp % 10;
            temp = temp / 10;
        }
        for (int i = 0; i < digitCount; i++) {
            reverseDigits[i] = digits[digitCount - 1 - i];
        }
        System.out.println("Digits: " + Arrays.toString(digits));
        System.out.println("Reverse Array: " + Arrays.toString(reverseDigits));
    }
}