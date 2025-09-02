import java.util.*;

public class NumberChecker1 {

    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    public static int[] storeDigits(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) digits[i] = s.charAt(i) - '0';
        return digits;
    }

    public static boolean isDuck(int[] digits) {
        for (int d : digits) if (d == 0) return true;
        return false;
    }

    public static boolean isArmstrong(int num) {
        int[] digits = storeDigits(num);
        int power = digits.length;
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, power);
        return sum == num;
    }

    public static int[] findLargestAndSecondLargest(int[] digits) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > first) {
                second = first;
                first = d;
            } else if (d > second && d != first) {
                second = d;
            }
        }
        return new int[]{first, second};
    }

    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < first) {
                second = first;
                first = d;
            } else if (d < second && d != first) {
                second = d;
            }
        }
        return new int[]{first, second};
    }

    public static void main(String[] args) {
        int number = 153;
        int[] digits = storeDigits(number);
        System.out.println("Duck? " + isDuck(digits));
        System.out.println("Armstrong? " + isArmstrong(number));
        System.out.println("Largest & Second Largest: " + Arrays.toString(findLargestAndSecondLargest(digits)));
        System.out.println("Smallest & Second Smallest: " + Arrays.toString(findSmallestAndSecondSmallest(digits)));
    }
}
