import java.util.Scanner;

public class NumberCheckArray {
    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static int compare(int num1, int num2) {
        if (num1 > num2) return 1;
        else if (num1 == num2) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        for (int num : arr) {
            if (isPositive(num)) {
                System.out.print(num + " is Positive and ");
                if (isEven(num)) System.out.println("Even");
                else System.out.println("Odd");
            } else {
                System.out.println(num + " is Negative");
            }
        }

        int result = compare(arr[0], arr[arr.length - 1]);
        if (result == 0) System.out.println("First and Last numbers are Equal");
        else if (result == 1) System.out.println("First number is Greater");
        else System.out.println("First number is Smaller");
    }
}
