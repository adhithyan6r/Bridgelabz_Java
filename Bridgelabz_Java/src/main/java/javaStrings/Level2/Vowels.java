package javaStrings.Level2;
import java.util.Scanner;
// Problem: Find the number of vowels and consonants in a string
public class Vowels{
    // Method to check whether a character is a vowel, consonant, or not a letter
    public static String checkCharacterType(char character) {
        // Convert uppercase letters to lowercase
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
        return "Invalid";
    }
    // Method to count vowels and consonants using charAt()
    public static int[] findVowelsAndConsonants(String text) {
        int vowel= 0;
        int consonants = 0;

        for (int i = 0; i < text.length(); i++) {
            String type = checkCharacterType(text.charAt(i));
            if (type.equals("Vowel")) {
                vowel++;
            } else if (type.equals("Consonant")) {
                consonants++;
            }
        }
        return new int[]{vowel, consonants};
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input: Take a word as input
        System.out.print("Enter a inputr: ");
        String text = scanner.nextLine();
        int[] result = findVowelsAndConsonants(text);
        System.out.println("Number of Vowels: " + result[0]);
        System.out.println("Number of Consonants: " + result[1]);
    }
}