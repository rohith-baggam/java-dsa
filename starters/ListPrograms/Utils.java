package starters.ListPrograms;

import java.util.ArrayList;

public class Utils {

    static int dignoalSumValue(ArrayList<ArrayList<Integer>> M, int i, int j) {
        int sum = 0;
        while (i < M.size() & j < M.get(0).size()) {
            sum += M.get(i).get(j);
            i++;
            j++;
        }
        return sum;
    }

    static int largestForwardDiagonal(ArrayList<ArrayList<Integer>> M) {
        int maxSum = -1;
        for (int i = 0; i < M.size(); i++) {
            for (int j = 0; j < M.get(0).size(); j++) {
                if (i == 0 | j == 0) {
                    int sum = dignoalSumValue(M, i, j);
                    if (sum > maxSum) {
                        maxSum = sum;
                    }
                }

            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int[][] array = { { 2, 9, 3, 5 }, { 2, 5, 4, 0 }, { 5, 2, 8, 5 } };
        ArrayList<ArrayList<Integer>> M = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            for (int j = 0; j < array[0].length; j++) {
                temp.add(array[i][j]);
            }
            M.add(temp);
        }
        System.out.println(largestForwardDiagonal(M));
    }

}
