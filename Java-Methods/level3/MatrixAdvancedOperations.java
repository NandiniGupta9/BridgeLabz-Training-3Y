public class MatrixAdvancedOperations {
    public static void main(String[] args) {
        int[][] A = {{4,7},{2,6}};

        System.out.println("Transpose:");
        printMatrix(transpose(A));

        System.out.println("Determinant: " + determinant2x2(A));

        System.out.println("Inverse:");
        double[][] inv = inverse2x2(A);
        printMatrix(inv);
    }

    static int[][] transpose(int[][] A) {
        int[][] T = new int[A[0].length][A.length];
        for (int i=0;i<A.length;i++)
            for (int j=0;j<A[0].length;j++)
                T[j][i] = A[i][j];
        return T;
    }

    static int determinant2x2(int[][] A) {
        return A[0][0]*A[1][1] - A[0][1]*A[1][0];
    }

    static double[][] inverse2x2(int[][] A) {
        double det = determinant2x2(A);
        if (det == 0) throw new ArithmeticException("No inverse, determinant=0");

        double[][] inv = new double[2][2];
        inv[0][0] = A[1][1]/det;
        inv[0][1] = -A[0][1]/det;
        inv[1][0] = -A[1][0]/det;
        inv[1][1] = A[0][0]/det;
        return inv;
    }

    static void printMatrix(double[][] M) {
        for (double[] row : M) {
            for (double val : row) System.out.printf("%.2f ", val);
            System.out.println();
        }
    }

    static void printMatrix(int[][] M) {
        for (int[] row : M) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }
}
