package classAndObject.Level2;
import java.util.Scanner;
// Class to check whether a string is a palindrome
public class Palindrome {
    String text = "";
    public boolean isPalindrome() {
        String reverse = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reverse);
    }
    public void display() {
        if (isPalindrome()) {
            System.out.println("The string is a palindrome");
        } else {
            System.out.println("The string is not a palindrome");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Palindrome palindrome1 = new Palindrome();
        System.out.print("Enter a string: ");
        palindrome1.text = scanner.nextLine();
        palindrome1.display();
    }
}