package javaControlFlow.Level2;
import  java.util.Scanner;
public class LeapYearSingleIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year:");
        int year = scanner.nextInt();
        if (year >= 1582 && (year%400 == 0 || (year % 4 == 0&& year % 100!=0))) {
            System.out.println(year + " is a Leap Year");
        } else if (year >= 1582) {
            System.out.println(year + " is not a Leap Year");
        }
    }
}
