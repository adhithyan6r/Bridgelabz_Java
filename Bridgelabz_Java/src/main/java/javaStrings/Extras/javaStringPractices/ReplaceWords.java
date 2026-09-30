package javaStrings.Extras.javaStringPractices;
import java.util.Scanner;
//Program for replacing a word from the string with another
public class ReplaceWords {
    public static String replace(String sentence, String oldWord, String newWord) {
        String[] words = sentence.split(" ");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(oldWord)) {
                result += newWord;
            } else {
                result += words[i];
            }
            if (i < words.length - 1) {
                result += " ";
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.print("Enter the word to replace: ");
        String oldWord = scanner.nextLine();
        System.out.print("Enter the new word: ");
        String newWord = scanner.nextLine();
        String result = replace(sentence, oldWord, newWord);
        System.out.println("Modified sentence: " + result);
    }
}