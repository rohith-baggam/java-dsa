package starters.ArrayPrograms.OneDArrays;

public class LeetCode extends Utils {
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }

        }

        return result;
    }

    public static void sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;

                }
            }
        }
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] nums = new int[nums1.length + nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            nums[i] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            nums[nums1.length + i] = nums2[i];
        }
        sortArray(nums);
        printArray(nums);
        if (nums.length % 2 == 0) {
            int medinaIndex = nums.length / 2;
            double median = nums[medinaIndex] + nums[medinaIndex - 1];
            return median / 2;
        } else {
            int medinaIndex = nums.length / 2;
            System.out.println(medinaIndex);
            return nums[medinaIndex - 1];
        }

    }

    public static void insertIntoArray(
            int[] nums1,
            int index,
            int value) {
        // int temp = nums1[index];

        for (int i = nums1.length - 1; i > index; i--) {
            nums1[i] = nums1[i - 1];
        }
        nums1[index] = value;
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        int x = 0, y = 0;
        for (int i = 0; i < m; i++) {
            if (nums1[x] > nums2[y]) {
                insertIntoArray(nums1, i, nums2[y]);
                y++;
            } else {
                x++;
            }

        }

        int startIndex = m + y;
        for (int i = y; i < nums2.length; i++) {

            nums1[startIndex] = nums2[i];
            startIndex += 1;
        }

    }

    public static int maxArea(int[] height) {
        int n = height.length;
        int i = 0, j = n - 1;
        int max_capacity = 0;

        while (i < j) {
            int max = height[i] < height[j] ? height[i] : height[j];
            int distance = (j - i) > 0 ? (j - i) : 1;

            int temp = max * distance;

            if (max_capacity < temp) {

                max_capacity = temp;
            }
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return max_capacity;
    }

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
        for (int i = 0; i < digits.length; i++) {
            number = number * 10 + digits[i];
        }
        System.out.println(number);
        number++;
        int[] result = new int[lengthOfNum(number)];
        int i = 0;
        while (number > 0) {
            result[i] = (int) number % 10;
            number = number / 10;
            i++;
        }
        int x = 0;
        int[] reverseResult = new int[result.length];
        for (int j = result.length - 1; j >= 0; j--) {
            reverseResult[x] = result[j];
            x++;
        }
        return reverseResult;
    }

    public static void main(String[] args) {
        int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 };
        plusOne(arr);

    }
}
