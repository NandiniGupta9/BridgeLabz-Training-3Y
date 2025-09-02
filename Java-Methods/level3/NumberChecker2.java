public class NumberChecker2 {
    public static int[] getDigits(int n) {
        String s = String.valueOf(n);
        int[] d = new int[s.length()];
        for (int i = 0; i < s.length(); i++) d[i] = s.charAt(i) - '0';
        return d;
    }

    public static int sumDigits(int[] digits) {
        int s = 0; for (int d : digits) s += d; return s;
    }

    public static int sumSquares(int[] digits) {
        int s = 0; for (int d : digits) s += Math.pow(d, 2); return s;
    }

    public static boolean isHarshad(int n, int[] digits) {
        return n % sumDigits(digits) == 0;
    }

    public static int[][] digitFrequency(int[] digits) {
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) { freq[i][0] = i; freq[i][1] = 0; }
        for (int d : digits) freq[d][1]++;
        return freq;
    }

    public static void main(String[] args) {
        int num = 21;
        int[] digits = getDigits(num);
        System.out.println("Number: " + num);
        System.out.println("Sum of Digits: " + sumDigits(digits));
        System.out.println("Sum of Squares: " + sumSquares(digits));
        System.out.println("Harshad? " + isHarshad(num, digits));
        int[][] freq = digitFrequency(digits);
        System.out.println("Digit Frequency:");
        for (int[] f : freq) if (f[1] > 0) System.out.println(f[0] + " -> " + f[1]);
    }
}
