package starters.arrays.OneDArrays;

import java.util.HashSet;
import java.util.Set;

public class Programs extends Utils {

    public static boolean isConsecutiveArray() {
        int[] arr1 = scanArray();
        printArray(arr1);
        int[] arr2 = scanArray();

        printArray(arr2);
        int[] arr = combineArray(arr1, arr2);
        printArray(arr);
        sortArray(arr, false);
        printArray(arr);
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] - arr[i + 1] != -1) {
                return false;
            }
        }
        return true;
    }

    public static boolean isValueExists(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                return true;
            }
        }
        return false;
    }

    public static Set<Integer> findCommonValues() {
        int[] arr1 = scanArray();
        printArray(arr1);
        int[] arr2 = scanArray();
        printArray(arr2);
        int[] arr = combineArray(arr1, arr2);
        printArray(arr);
        sortArray(arr, false);
        Set<Integer> commonValues = new HashSet<>();
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                commonValues.add(arr[i]);
            }
        }
        return commonValues;
    }

    public static int[] twoSum(int[] nums, int target) {
        Set<Integer> arr = new HashSet<>();
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {

                    arr.add(i);
                    arr.add(j);
                    k = k + 2;
                }
            }
        }
        int x = 0;
        int[] result = new int[k];
        for (int i : arr) {
            result[x] = i;
            x++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = { 2, 7, 11, 15 };
        int[] arr = twoSum(arr1, 9);
        printArray(arr);
    }

}
