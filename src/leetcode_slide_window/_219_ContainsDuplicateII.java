package leetcode_slide_window;

import java.util.HashSet;

class Solution219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int end = 0; end < nums.length; end++) {
            if (end > k) set.remove(nums[end - k - 1]);
            if (!set.add(nums[end])) return true;
        }
        return false;
    }
}

public class _219_ContainsDuplicateII {
    public static void main(String[] args) {
        Solution219 slt = new Solution219();
        int[] nums = {1, 2, 3, 1, 2, 3};
        int k = 2;
        boolean res = slt.containsNearbyDuplicate(nums, k);
        System.out.println(res);

    }
}
