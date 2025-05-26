package starters.ArrayPrograms.twoDArrays;

import java.util.ArrayList;
import java.util.List;

public class Programs extends Utils {

    public static int[][] sumOfArrays(
            int[][] array1,
            int[][] array2) {
        int m = array1.length;
        int n = array1[0].length;
        int[][] result = new int[m][n];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                result[i][j] = array1[i][j] + array2[i][j];
            }
        }
        return result;
    }

    public static void printTransposeArray(int[][] array) {
        System.out.println();
        for (int i = 0; i < array[0].length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[j][i]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void executeSumOfArrays() {
        int[][] array1 = scanArray();
        printArray(array1);
        int[][] array2 = scanArray();
        printArray(array2);
        int[][] result = sumOfArrays(array1, array2);
        printArray(result);
    }

    public static int[][] productOf2Arrays(
            int[][] array1,
            int[][] array2) {
        int m1 = array1.length;
        int n1 = array1[0].length;
        int m2 = array2.length;
        int n2 = array2[0].length;
        int[][] finalArray = new int[m1][n2];
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < m1; j++) {
                int sum = 0;
                for (int k = 0; k < n1; k++) {
                    sum += array1[i][k] * array2[k][j];
                }
                finalArray[i][j] = sum;
            }
        }

        return finalArray;
    }

    public static int sumOfSquareMatrix(
            int[][] array1) {
        int sum = 0;
        int m = array1.length;
        int n = array1[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (i == j) {
                    // ? sum of principle diagonal elements
                    sum += array1[i][j];
                }
                // ? sum of alter principle diagonal elements
                if ((i == 0 | j == 0) &
                        (i == m - 1 | j == n - 1)) {
                    sum += array1[i][j];
                }
            }
        }
        return sum;
    }

    // public static void printOuterCoOrdinates(int[][] array1, int i, int j,
    // boolean isEven) {
    // for (int x = i; x < j - i; x++) {
    // if (isEven) {
    // System.out.print(array1[i][x] + " ");
    // } else {
    // System.out.print(array1[x][j - i] + " ");
    // }

    // }
    // }

    // public static void printSprialMatrix(int[][] array1) {
    // // int[][] array1 = scanArray();
    // int i = 0, j = array1.length;
    // int m = array1.length, n = array1[0].length;
    // while (i < m && j < n) {
    // if (i % 2 == 0) {
    // i++;

    // }
    // printOuterCoOrdinates(array1, i, j, i % 2 == 0);
    // if()

    // }

    // // while (i < m & j < n) {
    // // printOuterCoOrdinates(array1, i, j, i % 2 == 0);
    // // i++;
    // // if(i)
    // // }
    // // for (int x = 0; x < n; x++) {
    // // printOuterCoOrdinates(array1, i, j, i % 2 == 0);
    // // }
    // }

    public static void setZero(int[][] matrix, int i, int j) {
        System.out.println();
        System.out.println(i + " : " + j);
        System.out.println();
        // handle vertical upper indexes -> Y Axis
        int upper_y = j - 1;
        while (upper_y >= 0) {
            matrix[i][upper_y] = 0;
            upper_y--;
        }
        // handle vertical lower indexes -> Y Axis
        int lower_y = j + 1;
        while (lower_y < matrix[0].length) {
            matrix[i][lower_y] = 0;
            lower_y++;
        }
        // handle horizontal left indexes -> X Axis
        int left_x = i - 1;
        while (left_x >= 0) {
            matrix[left_x][j] = 0;
            left_x--;
        }
        // handle horizontal right indexes -> X Axis
        int right_x = i + 1;
        while (right_x < matrix.length) {
            matrix[right_x][j] = 0;
            right_x++;
        }

    }

    public static void setZeroes(int[][] matrix) {

        List<List<Integer>> saveIndex = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(i);
                    temp.add(j);
                    saveIndex.add(temp);
                }
            }
        }

        for (List<Integer> i : saveIndex) {
            setZero(matrix, i.get(0), i.get(1));
        }

    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        printArray(matrix);
        // setZero(matrix, 1, 1);
        setZeroes(matrix);
        printArray(matrix);

    }
}
