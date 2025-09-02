public class NumberChecker5 {
    public static int sumDivisors(int n) {
        int sum = 1;
        for (int i = 2; i <= n / 2; i++) if (n % i == 0) sum += i;
        return sum;
    }

    public static boolean isPerfect(int n) {
        return sumDivisors(n) == n;
    }

    public static boolean isAbundant(int n) {
        return sumDivisors(n) > n;
    }

    public static boolean isDeficient(int n) {
        return sumDivisors(n) < n;
    }

    public static int fact(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) f *= i;
        return f;
    }

    public static boolean isStrong(int n) {
        int temp = n, sum = 0;
        while (temp > 0) {
            sum += fact(temp % 10);
            temp /= 10;
        }
        return sum == n;
    }

    public static void main(String[] args) {
        int num = 145;
        System.out.println("Number: " + num);
        System.out.println("Perfect? " + isPerfect(num));
        System.out.println("Abundant? " + isAbundant(num));
        System.out.println("Deficient? " + isDeficient(num));
        System.out.println("Strong? " + isStrong(num));
    }
}
