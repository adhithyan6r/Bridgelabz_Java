package javaStrings.Extras.javaStringPractices;
import  java.util.Scanner;
//Program to remove duplicates from the users input
public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the sting:");
        String str1 = scanner.nextLine();
        String result = "";
        for (int i =0; i<= str1.length()-1;i++){
            char ch = str1.charAt(i);
            if(result.indexOf(ch)==-1){
                result+=ch;
            }
        }
        System.out.println("After removing duplicates from the string : "+result);

    }
}
