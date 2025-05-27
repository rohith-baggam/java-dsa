package crio.java111.session6.TwoDArrays;

public class CenterElement {
    public static int matrixCenter(int[][] matrix) {
        int m = matrix.length;
        if (m % 2 == 0) {
            return -1;
        }
        int n = m > 1 ? matrix[0].length : 0;

        int i = m / 2;
        int j;
        if (n > 1) {
            j = n / 2;
        } else {
            j = 0;
        }
        return matrix[i][j];
    }

    static int diagonalSumII(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (i == 0 || i == mat.length - 1 || j == 0 || j == mat[0].length - 1) {
                    sum = sum + mat[i][j];
                }
            }
        }
        return sum;

    }

    public static void main(String[] args) {

        // assert (matrixCenter(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } })
        // == 5)
        // : "Expect 5 from { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }";
        // assert (matrixCenter(new int[][] { { 1, 2, 3 }, { 7, 8, 9 } }) == 5)
        // : "Expect 5 from { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } }";
        // System.out.println(matrixCenter(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7,
        // 8, 9 } }));
        // System.out.println(matrixCenter(new int[][] { { 1, 2, 3 }, { 4, 5, 6 } }));
        // System.out.println(matrixCenter(new int[][] { { 1, 2 }, { 4, 5 } }));
        // System.out.println(matrixCenter(new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7,
        // 8, 9 }, { 10, 11, 12 } }));
        System.out.println(diagonalSumII());

    }
}
