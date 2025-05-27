package crio.java111.session6.TwoDArrays;

public class SumOfDiagnonals {
    static int diagonalSumII(int[][] mat) {
        int sum = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (i == j) {
                    sum = sum + mat[i][j];
                    System.out.println(i + " :: " + j);
                }
                if ((i == 0 && j == mat.length - 1) || (j == 0 && i == mat[0].length - 1)) {
                    sum = sum + mat[i][j];
                    System.out.println(i + " : " + j);

                }
            }
        }
        System.out.println(sum);
        return sum;

    }

    public static void main(String args[]) {
        String str = "Mouse";
        System.out.println(str.toLowerCase());
        // assert (diagonalSumII(mat) == 25) : "Expect 25 for mat =
        // {{1,2,3},{4,5,6},{7,8,9}}";
        // System.out.println("All test cases in main function passed");
    }
}
