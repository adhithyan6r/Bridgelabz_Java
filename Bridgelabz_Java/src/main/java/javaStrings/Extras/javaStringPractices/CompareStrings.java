package javaStrings.Extras.javaStringPractices;
import java.util.Scanner;
public class CompareStrings {
    //Program to compare two strings
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
        int min = Math.min(str1.length(), str2.length());
        int result = 0;
        for (int i = 0; i < min; i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                result = str1.charAt(i) - str2.charAt(i);
                break;
            }
        }
        if (result == 0) {
            result = str1.length() - str2.length();
        }
        if (result < 0) {
            System.out.println(str1 + " comes before " + str2 + " in lexicographical order");
        } else if (result > 0) {
            System.out.println(str2 + " comes before " + str1 + " in lexicographical order");
        } else {
            System.out.println("Both strings are equal");
        }
    }
}