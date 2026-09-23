package javaArrays.Level1;
import java.util.Arrays;
import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number <= 0) {
            System.out.println("Invalid number");
            return;
        }
        int[] evenNumbers = new int[number / 2 + 1];
        int[] oddNumbers = new int[number / 2 + 1];
        int even = 0;
        int odd = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evenNumbers[even] = i;
                even++;
            } else {
                oddNumbers[odd] = i;
                odd++;
            }
        }
        System.out.println("Odd numbers:"+Arrays.toString((oddNumbers)));

        System.out.println("Even numbers:"+Arrays.toString(evenNumbers));
        }
    }
