import java.util.Scanner;

public class StringLengthWithoutLength {

    public static int myLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        int userLength = myLength(text);
        int builtIn = text.length();

        System.out.println("User defined length: " + userLength);
        System.out.println("Built-in length: " + builtIn);
    }
}
