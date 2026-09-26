package javaMethods.Level2;
import java.util.Scanner;
// Problem: Check whether a year is a leap year, considering only years from 1582 onwards.
public class LeapYear {
    // Method used for checking whether the given year is a leap year
    public static boolean isLeapYear(int year) {
        if (year < 1582) {
            return false;
        }
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input: Take the year from the user
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        if (year < 1582) {
            System.out.println("Invalid year");
        } else if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }
    }
}