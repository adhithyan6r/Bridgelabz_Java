package javaStrings.Extras.javaStringPractices;
import java.util.Scanner;
//to check the occurance of substring in a given string
public class SubstringOccur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter the substring: ");
        String sub = scanner.nextLine();
        int count = 0;
        for (int i = 0; i <= str.length() - sub.length(); i++) {
            if (str.substring(i, i + sub.length()).equals(sub)) {
                count++;
            }
        }

        System.out.println("Substring occurrences: " + count);
    }
}