package javaStrings.Level3;
import java.util.Scanner;
// Problem: Find the first non-repeating character in a string and show the result
public class NonRepeating{
    // To find the first non-repeating character using charAt()
    public static char findFirstNonRepeating(String text) {
        int[] frequency = new int[256];
        // To find the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            frequency[character]++;
        }
        // To find the first character with frequency one
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            if (frequency[character] == 1) {
                return character;
            }
        }
        return '\0';
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input: Take text from the user
        System.out.print("Enter text: ");
        String text = scanner.nextLine();
        char result = findFirstNonRepeating(text);
        if (result == '\0') {
            System.out.println("No non-repeating character found");
        } else {
            System.out.println("First non-repeating character: " + result);
        }
    }
}