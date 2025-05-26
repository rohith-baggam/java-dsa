package starters.HashMapPrograms;

import java.util.HashMap;

public class Utils {

    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            if (hashMap.get(nums[i]) != null) {
                count = hashMap.get(nums[i]) + 1;
            }
            hashMap.put(nums[i], count);
        }
        System.out.println(hashMap);
        for (int i : hashMap.keySet()) {
            if (hashMap.get(i) > 1) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

        int[] nums = { 2, 2, 1 };
        System.out.println(singleNumber(nums));
    }
}
