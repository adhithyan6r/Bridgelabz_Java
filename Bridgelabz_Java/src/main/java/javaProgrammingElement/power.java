package main.java.javaProgrammingElement;
import java.util.Scanner;
public class power {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int pow=(int)Math.pow(a,b);
        System.out.println(pow);
    }
}
