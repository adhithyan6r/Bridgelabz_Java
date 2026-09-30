package javaStrings.Extras.builtInFunctionsPractices;
import java.time.LocalDate;
import java.util.Scanner;
// program to take date input and subtract 3 weeks
public class DateArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter date (yyyy-MM-dd): ");
        LocalDate date = LocalDate.parse(scanner.nextLine());
        date = date.plusDays(7);
        System.out.println("After adding 7 days: " + date);
        date = date.plusMonths(1);
        System.out.println("After adding 1 month: " + date);
        date = date.plusYears(2);
        System.out.println("After adding 2 years: " + date);
        date = date.minusWeeks(3);
        System.out.println("After subtracting 3 weeks: " + date);
    }
}