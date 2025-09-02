import java.util.Scanner;

public class Factors {
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) factors[index++] = i;
        }
        return factors;
    }

    public static int sum(int[] factors) {
        int total = 0;
        for (int f : factors) total += f;
        return total;
    }

    public static int sumOfSquares(int[] factors) {
        int total = 0;
        for (int f : factors) total += Math.pow(f, 2);
        return total;
    }

    public static int product(int[] factors) {
        int prod = 1;
        for (int f : factors) prod *= f;
        return prod;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] factors = findFactors(num);

        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");
        System.out.println("\nSum: " + sum(factors));
        System.out.println("Sum of squares: " + sumOfSquares(factors));
        System.out.println("Product: " + product(factors));
    }
}
