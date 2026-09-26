package javaStrings.Level3;
import java.util.Scanner;
// Problem: Find the frequency of characters in a string using unique characters and display the result
public class UniqueFrequency {
    // To find unique characters using charAt()
    public static char[] uniqueCharacters(String text) {
        char[] unique = new char[text.length()];
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (current == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                unique[count] = current;
                count++;
            }
        }
        char[] result = new char[count];
        for (int i = 0; i < count; i++) {
            result[i] = unique[i];
        }
        return result;
    }
    // To find the frequency of unique characters
    public static String[][] findFrequency(String text) {
        int[] frequency = new int[256];
        // To count the frequency of each character
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            frequency[character]++;
        }
        char[] unique = uniqueCharacters(text);
        String[][] result = new String[unique.length][2];
        // To store unique characters and their frequencies
        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(frequency[unique[i]]);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input: Take text from the user
        System.out.print("Enter text: ");
        String text = scanner.nextLine();
        String[][] result = findFrequency(text);
        System.out.println("Character\tFrequency");
        for (String[] row : result) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }
}