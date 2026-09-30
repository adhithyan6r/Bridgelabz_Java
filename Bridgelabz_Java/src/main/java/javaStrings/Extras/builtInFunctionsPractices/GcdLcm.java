package javaStrings.Extras.builtInFunctionsPractices;
import java.util.Scanner;
//Program to find the GCD and LCM of the two numbers given by user
public class GcdLcm {
    public static long calculateGCD(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static long calculateLCM(long a, long b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        long gcd = calculateGCD(a, b);
        return Math.abs(Math.multiplyExact(a / gcd, b));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        long a = scanner.nextLong();
        System.out.print("Enter second number: ");
        long b = scanner.nextLong();
            long gcd = calculateGCD(Math.abs(a), Math.abs(b));
            long lcm = calculateLCM(a, b);
            System.out.println("GCD: " + gcd);
            System.out.println("LCM: " + lcm);
        }
    }
