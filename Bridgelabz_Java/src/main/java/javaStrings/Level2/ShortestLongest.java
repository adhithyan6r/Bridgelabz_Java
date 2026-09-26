package javaStrings.Level2;
import java.util.Scanner;
// Problem: Split a string into words and find the shortest and longest word
public class ShortestLongest {
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
    // Method: Split the string into words
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
    //create a 2d array containing words and their lengths
    public static String[][] findWordLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }
    // Find index of shortest and longest words
    public static int[] findShortestLongest(String[][] wordLengthArray) {
        int shortestIndex = 0;
        int longestIndex = 0;
        for (int i = 1; i < wordLengthArray.length; i++) {
            int currentLength = Integer.parseInt(wordLengthArray[i][1]);
            int shortestLength = Integer.parseInt(wordLengthArray[shortestIndex][1]);
            int longestLength = Integer.parseInt(wordLengthArray[longestIndex][1]);
            if (currentLength < shortestLength) {
                shortestIndex = i;
            }
            if (currentLength > longestLength) {
                longestIndex = i;
            }
        }
        return new int[]{shortestIndex, longestIndex};
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input: Take a sentence using nextLine().
        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine();
        String[] words = splitString(text);
        String[][] wordLengthArray = findWordLengths(words);
        int[] result = findShortestLongest(wordLengthArray);
        int shortestIndex = result[0];
        int longestIndex = result[1];
        System.out.println("\nShortest Word: " + wordLengthArray[shortestIndex][0] + " (" + wordLengthArray[shortestIndex][1] + ")");
        System.out.println("Longest Word: " + wordLengthArray[longestIndex][0] + " (" + wordLengthArray[longestIndex][1] + ")");
    }
}