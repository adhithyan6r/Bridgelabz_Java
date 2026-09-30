package javaStrings.Extras.javaStringPractices;
import java.util.Arrays;
import java.util.Scanner;
//Program to find if a string is the longest from  the sentence
public class LongestWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the sting:");
        String str1 = scanner.nextLine();
        String[] arr = str1.split("\\s+");
        int max = 0;
        int index =0;
        for(int i = 0 ; i<=arr.length-1;i++){
            if (arr[i].length()>max){
                max = arr[i].length();
                index = i;
            }else{
                continue;
            }
        }
        System.out.println("the longest word in the string is "+arr[index]);
    }
}