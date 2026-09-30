package javaStrings.Extras.javaStringPractices;
import  java.util.Scanner;
//Program to find if the given string is palindrome
public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the sting:");
        String str1 = scanner.nextLine();
        String reverse ="";
        for(int i =str1.length()-1;i>=0;i--){
            reverse+=str1.charAt(i);
        }
        if(str1.equalsIgnoreCase(reverse)){
            System.out.println("the string is palindrome");
        }else{
            System.out.println("it is not palindrome");
        }

    }
}
