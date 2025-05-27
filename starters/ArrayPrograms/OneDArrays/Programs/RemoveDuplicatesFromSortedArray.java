package starters.ArrayPrograms.OneDArrays.Programs;

import starters.ArrayPrograms.OneDArrays.Utils;

public class RemoveDuplicatesFromSortedArray extends Utils {
    public static void removeElement(int[] nums, int index) {
        for (int i = index; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = 0;
    }

    public static boolean frequency(int[] nums, int value) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == value) {
                count++;
            }
            if (count > 2) {
                return true;
            }

        }
        return false;
    }

    public static int removeDuplicates(int[] nums) {

        int index = 0;
        int lastIndex = 0;

        while (index < nums.length) {

            if (frequency(nums, nums[index])) {
                printArray(nums);
                removeElement(nums, nums[index]);

            }
            index++;
            if (index > 0 && index < nums.length - 1) {
                if (nums[index - 1] > 0 && nums[index] == 0) {
                    break;
                }
            }

        }
        return nums.length - index;

    }

    public static void main(String[] args) {
        int[] arr = { 0, 0, 1, 1, 1, 1, 2, 3, 3 };
        removeDuplicates(arr);
    }
}
