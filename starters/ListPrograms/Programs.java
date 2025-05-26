package starters.ListPrograms;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Programs {
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                int k = j + 1;
                if (i != j & i != k & j != k) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> arr = new ArrayList<>();
                        arr.add(nums[i]);
                        arr.add(nums[j]);
                        arr.add(nums[k]);
                        Collections.sort(arr);
                        if (!result.contains(arr)) {

                            result.add(arr);
                        }

                    }
                }
            }
        }
        return result;
    }

    public static int searchInsert(int[] nums, int target) {
        int index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                return i;
            }
            if (i < nums.length - 1) {
                if (nums[i] < target & nums[i + 1] > target) {
                    index = i + 1;
                }
            } else {
                if (nums[i] + 1 == target) {
                    return i + 1;
                }
            }

        }
        return index;
    }

    public static List<List<Integer>> getSelfCombinations(int[] candidates, int target) {
        List<List<Integer>> selfCombinations = new ArrayList<>();
        for (int i = 0; i < candidates.length; i++) {
            if (target % candidates[i] == 0) {
                int occurance = target / candidates[i];
                List<Integer> combinations = new ArrayList<>();
                for (int j = 0; j < occurance; j++) {
                    combinations.add(candidates[i]);
                }
                selfCombinations.add(combinations);
            }
        }
        return selfCombinations;
    }

    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        System.out.println(getSelfCombinations(candidates, target));
        List<List<Integer>> result = getSelfCombinations(candidates, target);
        for (int i = 0; i < candidates.length; i++) {

        }
        return null;
    }

    public static void main(String[] args) {

        int[] arr = { 2, 3, 5 };
        System.out.println(combinationSum(arr, 8));
    }
}
