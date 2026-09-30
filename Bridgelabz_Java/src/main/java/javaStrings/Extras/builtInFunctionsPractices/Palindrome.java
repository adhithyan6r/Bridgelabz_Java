package javaStrings.Extras.builtInFunctionsPractices;
import java.util.Scanner;
//To check if the given string is palindrome or not
public class Palindrome {
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reverse = new StringBuilder(str).reverse().toString();
        return str.equals(reverse);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        if (isPalindrome(str)) {
            System.out.println("it is a palindrome");
        } else {
            System.out.println("it is not a palindrome");
        }
    }
}