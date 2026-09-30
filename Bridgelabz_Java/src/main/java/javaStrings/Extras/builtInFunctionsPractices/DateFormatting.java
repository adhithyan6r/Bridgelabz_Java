package javaStrings.Extras.builtInFunctionsPractices;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class DateFormatting {
    // program to display date in three different format
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
        System.out.println("Format 1: " + date.format(format1));
        System.out.println("Format 2: " + date.format(format2));
        System.out.println("Format 3: " + date.format(format3));
    }
}