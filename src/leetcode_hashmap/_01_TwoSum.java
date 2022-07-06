package leetcode_hashmap;

import java.util.HashMap;


class Solution01 {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length == 0) return new int[0];

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(target - nums[i])) {
                map.put(nums[i], i);
            } else {
                return new int[]{map.get(target - nums[i]), i};
            }
        }
        return new int[0];
    }

    // brute force
    public int[] twoSum2(int[] nums, int target) {
        if (nums == null || nums.length == 0) return new int[0];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }
}

public class _01_TwoSum {
    public static void main(String[] args) {
        int[] arr = {3, 3};
        int target = 6;
        Solution01 slt = new Solution01();
        int[] res = slt.twoSum(arr, target);

        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
