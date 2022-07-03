package leetcode_dynamic_programming;

class Solution53 {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) return nums[0];

        int res = nums[0];
        int sum = 0;
        for (int i : nums) {
            if (sum <= 0) {
                sum = i;
            } else {
                sum += i;
            }
            res = Math.max(sum, res);
        }
        return res;
    }
}

public class _53_Maximum_Subarray {
    public static void main(String[] args) {
        int[] arr = {5, 4, -1, 7, 8};
        Solution53 slt = new Solution53();
        int res = slt.maxSubArray(arr);
        System.out.println(res);
    }
}
