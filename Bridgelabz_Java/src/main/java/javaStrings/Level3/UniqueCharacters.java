package javaStrings.Level3;
import java.util.Scanner;
// Problem: Find unique characters in a string using the charAt() method and display the result
public class UniqueCharacters {
    // To find the length of the text
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException exception) {
            return count;
        }
    }
    // To find unique characters
    public static char[] findUniqueCharacters(String text) {
        int length = findLength(text);
        char[] uniqueCharacters = new char[length];
        int uniqueCount = 0;
        for (int i = 0; i < length; i++) {
            char current = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (current == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueCharacters[uniqueCount] = current;
                uniqueCount++;
            }
        }
        // To create a new array containing only unique characters
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = uniqueCharacters[i];
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input: Take text from the user
        System.out.print("Enter text: ");
        String text = scanner.nextLine();
        char[] result = findUniqueCharacters(text);
        System.out.print("Unique characters: ");
        for (char character : result) {
            System.out.print(character + " ");
        }
    }
}