import java.util.Scanner;

public class NumberFormatDemo {
    public static void generateException(String text) {
        int num = Integer.parseInt(text); // If text is not a number
        System.out.println("Number: " + num);
    }

    public static void handleException(String text) {
        try {
