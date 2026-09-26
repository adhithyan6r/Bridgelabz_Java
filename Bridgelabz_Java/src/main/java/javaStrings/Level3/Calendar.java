package javaStrings.Level3;
import java.util.Scanner;
// Problem: Display a calendar for a given month and year
public class Calendar {
    // To get the name of the month
    public static String getMonthName(int month) {
        String[] months = {
                "January", "February", "March", "April",
                "May", "June", "July", "August",
                "September", "October", "November", "December"
        };
        return months[month - 1];
    }
    // To check if the year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }
    // To get the number of days in the month
    public static int getDaysInMonth(int month, int year) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return days[month - 1];
    }
    // To get the first day of the month using Gregorian calendar algorithm
    public static int getFirstDay(int month, int year) {
        int day = 1;
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (day + x + 31 * m0 / 12) % 7;
    }
    // To display the calendar
    public static void displayCalendar(int month, int year) {
        int firstDay = getFirstDay(month, year);
        int days = getDaysInMonth(month, year);
        System.out.println("\n     " + getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        // To create indentation before the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }
        // To display the days of the month
        for (int day = 1; day <= days; day++) {
            System.out.printf("%3d ", day);
            if ((firstDay + day) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input: Take month and year from the user
        System.out.print("Enter month: ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        displayCalendar(month, year);
    }
}