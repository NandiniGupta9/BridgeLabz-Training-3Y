public class MatrixOperations {
    public static void main(String[] args) {
        int[][] A = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] B = {{9,8,7},{6,5,4},{3,2,1}};

        System.out.println("Addition:");
        printMatrix(add(A,B));

        System.out.println("Subtraction:");
        printMatrix(subtract(A,B));

        System.out.println("Multiplication:");
        printMatrix(multiply(A,B));
    }

    static int[][] add(int[][] A,int[][] B) {
        int[][] C = new int[A.length][A[0].length];
        for (int i=0;i<A.length;i++)
            for (int j=0;j<A[0].length;j++)
                C[i][j] = A[i][j] + B[i][j];
        return C;
    }

    static int[][] subtract(int[][] A,int[][] B) {
        int[][] C = new int[A.length][A[0].length];
        for (int i=0;i<A.length;i++)
            for (int j=0;j<A[0].length;j++)
                C[i][j] = A[i][j] - B[i][j];
        return C;
    }

    static int[][] multiply(int[][] A,int[][] B) {
        int[][] C = new int[A.length][B[0].length];
        for (int i=0;i<A.length;i++)
            for (int j=0;j<B[0].length;j++)
                for (int k=0;k<A[0].length;k++)
                    C[i][j] += A[i][k]*B[k][j];
        return C;
    }

    static void printMatrix(int[][] M) {
        for (int[] row : M) {
            for (int val : row) System.out.print(val + " ");
            System.out.println();
        }
    }
}
