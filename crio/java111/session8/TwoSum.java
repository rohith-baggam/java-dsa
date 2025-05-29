package crio.java111.session8;

import java.util.HashMap;

import starters.ArrayPrograms.OneDArrays.Utils;

public class TwoSum extends Utils {
    public static int[] towSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[] { map.get(target - nums[i]), i };
            }
            map.put(nums[i], i);

        }
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        printArray(towSum(new int[] { 2, 4, 5, 9, 8 }, 7));

    }
}
