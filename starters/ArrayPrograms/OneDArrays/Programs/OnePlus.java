package starters.ArrayPrograms.OneDArrays.Programs;

import starters.ArrayPrograms.OneDArrays.Utils;

public class OnePlus extends Utils {
    public static int lengthOfNum(long num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    public static int[] plusOne(int[] digits) {
        long number = 0;
        boolean isValueUpdated = false;
        for (int i = 0; i < digits.length; i++) {

            number = number * 10 + digits[i];

        }

        System.out.println(number);
        number++;
        System.out.println(number);

        int[] result = new int[lengthOfNum(number)];
        int i = 0;
        while (number > 0) {
            result[i] = (int) number % 10;
            System.out.println(number % 10 + " " + (int) number % 10);
            number = number / 10;
            i++;
        }
        int x = 0;
        printArray(result);
        int[] reverseResult = new int[result.length];
        for (int j = result.length - 1; j >= 0; j--) {
            reverseResult[x] = result[j];
            x++;
        }
        return reverseResult;
    }

    public static int[] convertArray(long number) {
        int[] arr = new int[lengthOfNum(number)];
        int i = 0;
        while (number > 0) {
            arr[i] = (int) number % 10;
            System.out.println(number % 10 + " : " + (int) number % 10);
            number = number / 10;
            i++;
        }
        return arr;
    }
    // public static int[] convertArray(long number) {
    // // Step 1: Count number of digits
    // int length = lengthOfNum(number);
    // int[] arr = new int[length];

    // // Step 2: Fill array from most significant digit to least
    // for (int i = length - 1; i >= 0; i--) {
    // arr[i] = (int) (number % 10);
    // number /= 10;
    // }

    // return arr;
    // }

    public static void main(String[] args) {
        long number = 9876543211L;
        printArray(convertArray(number));
        // int[] digits = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        // printArray(plusOne(digits));
    }
}
