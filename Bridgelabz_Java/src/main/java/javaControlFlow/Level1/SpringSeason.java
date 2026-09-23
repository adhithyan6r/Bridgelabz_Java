package javaControlFlow.Level1;
import java.util.Scanner;
public class SpringSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the month;");
        int month = scanner.nextInt();
        System.out.println("enter the day");
        int day = scanner.nextInt();
        if(month<=3 && day<20 || month>=6 && day>20){
                System.out.println("its not a spring season");
            }
        else{
            System.out.println("its a spring season");
        }
            }
        }


