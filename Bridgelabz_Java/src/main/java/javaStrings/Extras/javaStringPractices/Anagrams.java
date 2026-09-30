package javaStrings.Extras.javaStringPractices;
import java.util.Arrays;
import java.util.Scanner;
public class Anagrams {
    //Program to find if the given strings are anagrams
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine().replace(" ", "").toLowerCase();
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine().replace(" ", "").toLowerCase();
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (Arrays.equals(arr1, arr2)) {
            System.out.println("it is a anagram");
        } else {
            System.out.println("not an anagram");
        }
    }
}