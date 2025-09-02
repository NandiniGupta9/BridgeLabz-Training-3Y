import java.util.Arrays;

public class NumberChecker3 {
    public static int[] getDigits(int n) {
        String s = String.valueOf(n);
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++) d[i] = s.charAt(i) - '0';
        return d;
    }

    public static int[] reverse(int[] arr) {
        int[] rev = new int[arr.length];
        for (int i = 0; i < arr.length; i++) rev[i] = arr[arr.length - 1 - i];
        return rev;
    }

    public static boolean arraysEqual(int[] a, int[] b) {
        return Arrays.equals(a, b);
    }

    public static boolean isPalindrome(int[] digits) {
        return arraysEqual(digits, reverse(digits));
    }

    public static boolean isDuck(int[] digits) {
        for (int d : digits) if (d == 0) return true;
        return false;
    }

    public static void main(String[] args) {
        int num = 121;
        int[] digits = getDigits(num);
        System.out.println("Number: " + num);
        System.out.println("Palindrome? " + isPalindrome(digits));
        System.out.println("Duck? " + isDuck(digits));
    }
}
