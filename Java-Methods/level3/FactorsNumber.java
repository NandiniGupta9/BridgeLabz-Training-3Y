import java.util.Scanner;

public class FactorsNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] factors = findFactors(num);

        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");

        System.out.println("\nSum of Factors: " + sumFactors(factors));
        System.out.println("Product of Factors: " + productFactors(factors));
        System.out.println("Sum of Squares of Factors: " + sumSquaresFactors(factors));
    }

    public static int[] findFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) if (num % i == 0) count++;

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) factors[index++] = i;
        }
        return factors;
    }

    public static int sumFactors(int[] arr) {
        int sum = 0;
        for (int f : arr) sum += f;
        return sum;
    }

    public static int productFactors(int[] arr) {
        int product = 1;
        for (int f : arr) product *= f;
        return product;
    }

    public static int sumSquaresFactors(int[] arr) {
        int sum = 0;
        for (int f : arr) sum += Math.pow(f, 2);
        return sum;
    }
}
