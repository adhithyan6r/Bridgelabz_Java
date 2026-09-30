package javaStrings.Extras.javaStringPractices;
import java.util.Scanner;
public class MostFrequent {
    //Program to find if a charecter is most frequent in a string
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        int max = 0;
        char result = ' ';
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                result = str.charAt(i);
            }
        }
        if (str.isEmpty()) {
            System.out.println("String is empty");
        } else {
            System.out.println("Most Frequent Character: '" + result + "'");
        }
    }
}