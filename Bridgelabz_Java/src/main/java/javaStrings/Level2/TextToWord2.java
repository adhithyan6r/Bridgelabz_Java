package javaStrings.Level2;
import java.util.Scanner;
// Problem: Split a string into words and return the words with their lengths in a 2D array.
public class TextToWord2 {
    // Method to find string length
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
    // Method to split the string into words
    public static String[] splitString(String text) {
        int length = findLength(text);
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        int[] spaceIndexes = new int[wordCount - 1];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index] = i;
                index++;
            }
        }
        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < wordCount; i++) {
            int end;
            if (i < spaceIndexes.length) {
                end = spaceIndexes[i];
            } else {
                end = length;
            }
            String word = "";
            for (int j = start; j < end; j++) {
                word = word + text.charAt(j);
            }
            words[i] = word;
            start = end + 1;
        }
        return words;
    }
    //Method to create an array containing each word and its length
    public static String[][] findWordLengths(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input: Take a sentence using nextLine().
        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine();
        String[] words = splitString(text);
        String[][] result = findWordLengths(words);
        System.out.println("\nWord\tLength");
        for (int i = 0; i < result.length; i++) {
            int length = Integer.parseInt(result[i][1]);
            System.out.println(result[i][0] + "\t" + length);
        }
    }
}