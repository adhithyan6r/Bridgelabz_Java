package javaStrings.Level2;
import java.util.Scanner;

// Problem: Find vowels and consonants in a string and display the character type.
public class CharacterType{
    // Metho d to check whether a character is a vowel, consonant, or not a letter.
    public static String checkCharacterType(char character) {
        // converting uppercase letters to lowercase
        if (character >= 'A' && character <= 'Z') {
            character = (char) (character + 32);
        }
        if (character >= 'a' && character <= 'z') {
            if (character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }
    // Method to find the type of every character
    public static String[][] findCharacterTypes(String text) {
        String[][] result = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            result[i][0] = String.valueOf(character);
            result[i][1] = checkCharacterType(character);
        }
        return result;
    }
    // Method to display the 2D String array in tabular format
    public static void displayCharacterTypes(String[][] result) {
        System.out.println("\nCharacter\tType");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t\t" + result[i][1]);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Taking input from the user
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        String[][] result = findCharacterTypes(text);
        displayCharacterTypes(result);
    }
}