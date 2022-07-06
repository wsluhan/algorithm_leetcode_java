package leetcode_array;

class Solution1480 {
    public int[] runningSum(int[] nums) {
        if (nums.length == 1) return new int[]{nums[0]};
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}

public class _1480_RunningSum1dArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 1};
        Solution1480 slt = new Solution1480();
        slt.runningSum(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
