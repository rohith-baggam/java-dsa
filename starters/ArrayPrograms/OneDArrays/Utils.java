package starters.ArrayPrograms.OneDArrays;

import java.util.Scanner;

public class Utils {
    public static int[] scanArray() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        // scanner.close();
        return arr;
    }

    public static void printArray(int[] arr) {

        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + " : " + arr[i]);
            System.out.println();
        }

    }

    public static int[] combineArray(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            arr[arr1.length + i] = arr2[i];
        }
        return arr;
    }

    public static void sortArray(int[] arr, boolean is_des) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (is_des) {
                    if (arr[i] < arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                } else {
                    if (arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }

            }
        }
    }

    public static double averageOfArray(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count += arr[i];
        }
        return count / arr.length;
    }

    public static int secondLargest(int[] arr) {
        if (arr.length < 2)
            return 0;

        sortArray(arr, true);
        return arr[1];
    }

    public static void rotateArrayBackward(int[] arr) {
        // 1 -> 2 -> 3 -> 4 -> 5 = 2 -> 3 -> 4 -> 5 -> 1
        if (arr.length < 2) {
            return;
        }
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = temp;
    }

    public static void rotateArrayForward(int[] arr) {
        // 1 -> 2 -> 3 -> 4 -> 5 = 5 -> 1 -> 2 -> 3 -> 4
        if (arr.length < 2) {
            return;
        }
        int temp = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;
    }

}
