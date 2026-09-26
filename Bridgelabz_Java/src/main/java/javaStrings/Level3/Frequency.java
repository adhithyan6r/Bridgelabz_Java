package javaStrings.Level3;
import java.util.Scanner;
// Problem: Find the frequency of characters in a string using the charAt() method and display the result
public class Frequency {
    // To find the frequency of each character
    public static String[][] findFrequency(String text) {
        int[] frequency = new int[256];
        // To count the frequency using charAt()
        for (int i = 0; i < text.length(); i++) {
            char character = text.charAt(i);
            frequency[character]++;
        }
        int count = 0;
        // To count characters that are present
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                count++;
            }
        }
        String[][] result = new String[count][2];
        int index = 0;
        // To store characters and frequencies
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char) i);
                result[index][1] = String.valueOf(frequency[i]);
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
        String[][] result = findFrequency(text);
        System.out.println("Character\tFrequency");
        for (String[] row : result) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
    }
}