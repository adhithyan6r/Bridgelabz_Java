package javaStrings.Level3;
import java.util.Scanner;
// Problem: Find the frequency of characters in a string using nested loops and display the result
public class NestedLoopsFrequency {
    // To find the frequency of characters using nested loops
    public static String[] findFrequency(String text) {
        char[] characters = text.toCharArray();
        int[] frequency = new int[characters.length];
        int count = 0;
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] == '0') {
                continue;
            }
            frequency[i] = 1;
            for (int j = i + 1; j < characters.length; j++) {
                if (characters[i] == characters[j]) {
                    frequency[i]++;
                    characters[j] = '0';
                }
            }
            count++;
        }
        String[] result = new String[count];
        int index = 0;
        // To store characters and frequencies
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] != '0') {
                result[index] = characters[i] + " : " + frequency[i];
                index++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input: Take text from the user
        System.out.print("Enter text: ");
        String text = scanner.nextLine();
        String[] result = findFrequency(text);
        System.out.println("Character : Frequency");
        for (String value : result) {
            System.out.println(value);
        }
    }
}