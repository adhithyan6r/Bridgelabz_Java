package javaStrings.Extras.javaStringPractices;
import java.util.Scanner;
//Program to count the vowels and the consonants in the given string
public class VowelsConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = scanner.nextLine();
        int vowels = 0;
        int consonants = 0;
        for(int i = 0; i<=word.length()-1;i++){
            if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u') {
                vowels++;
            } else if (word.charAt(i)==' ') {
                continue;
            } else{
                consonants++;
            }
        }
        System.out.println("Number of vowels: "+vowels +" and number of consonants " +consonants);
    }
}
