package javaStrings.Level1;
import java.util.Scanner;
// Problem: Return all characters using a user-defined method and compare with toCharArray().
public class ReturnAll {
    // Method: Return characters
    public static char[] getCharacters(String text) {
        char[] characters = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            characters[i] = text.charAt(i);
        }
        return characters;
    }
    // Method: Compare two character arrays.
    public static boolean compareArrays(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input: Take text
        System.out.print("Enter text: ");
        String text = scanner.next();
        char[] userDefinedArray = getCharacters(text);
        char[] builtInArray = text.toCharArray();
        boolean result = compareArrays(userDefinedArray, builtInArray);
        System.out.print("Characters using user defined method: ");
        for (char character : userDefinedArray) {
            System.out.print(character + " ");
        }
        System.out.println();
        System.out.print("Characters using toCharArray(): ");
        for (char character : builtInArray) {
            System.out.print(character + " ");
        }
        System.out.println();
        System.out.println("Both arrays are same: " + result);
    }
}