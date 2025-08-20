import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        long number = sc.nextLong();

        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];
        int[] reverse = new int[numStr.length()];

        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }

        for (int i = 0; i < digits.length; i++) {
            reverse[i] = digits[digits.length - 1 - i];
        }

        System.out.print("Reversed Number: ");
        for (int d : reverse) {
            System.out.print(d);
        }
    }
}
