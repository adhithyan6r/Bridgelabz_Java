package javaStrings.Extras.javaStringPractices;
import  java.util.Scanner;
//Program to reverse a string
public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the sting:");
        String str1 = scanner.nextLine();
        String reverse ="";
        for(int i =str1.length()-1;i>=0;i--){
            reverse+=str1.charAt(i);
        }
        System.out.println("The reversed string is: "+reverse);
    }
}
