package javaStrings.Level1;
// Problem: Demonstrate NullPointerException using a null String.
public class NullPointerException {
    // Method: Generate NullPointerException.
    public static void generateException() {
        String text = null;
        System.out.println(text.length());
    }
    public static void main(String[] args) {
        // Call the method to generate the exception.
        generateException();
    }
}