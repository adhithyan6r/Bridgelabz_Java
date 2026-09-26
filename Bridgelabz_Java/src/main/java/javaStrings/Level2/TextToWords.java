package javaStrings.Level2;
import java.util.Scanner;
// Problem: Split a string into words without using split() and compare with the built-in split() method.
public class TextToWords{
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
    // Method for Spliting the string into words
    public static String[] splitString(String text) {
        int length = findLength(text);
        int wordCount = 1;
        // Count the number of words using spaces.
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }
        int[] spaceIndexes = new int[wordCount - 1];
        int index = 0;
        // Store the positions of spaces
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[index] = i;
                index++;
            }
        }
        String[] words = new String[wordCount];
        int start = 0;
        // Create words using the stored space indexes
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
    // Method for comparing two String arrays
    public static boolean compareArrays(String[] first, String[] second) {
        if (first.length != second.length) {
            return false;
        }
        for (int i = 0; i < first.length; i++) {
            if (!first[i].equals(second[i])) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input: Take a sentence
        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine();
        String[] userDefinedWords = splitString(text);
        String[] builtInWords = text.split(" ");
        System.out.println("\nWords using user-defined method:");
        for (String word : userDefinedWords) {
            System.out.println(word);
        }
        System.out.println("\nWords using split():");
        for (String word : builtInWords) {
            System.out.println(word);
        }
        System.out.println("\nBoth results are same: "
                + compareArrays(userDefinedWords, builtInWords));
    }
}