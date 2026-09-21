package main.java.javaProgrammingElement;
import java.util.Scanner;

public class vol_cyl {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double r = s.nextDouble();
        double h = s.nextDouble();
        double vol = 3.14 * r * r * h;
        System.out.println(vol);
    }
}
