package leetcode_two_pointers;

class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) return;
        if (m == 0) {
            for (int i = 0; i < n; i++) {
                nums1[i] = nums2[i];
            }
            return;
        }

        int i = m - 1, j = n - 1, k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] >= nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }

        while (i >= 0) {
            nums1[k--] = nums1[i--];
        }

        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }
}

public class _88_MergeSortedArray {
    public static void main(String[] args) {
        int[] arr1 = {2, 0};
        int[] arr2 = {1};
        int m = 1;
        int n = 1;
        Solution88 slt = new Solution88();
        slt.merge(arr1, m, arr2, n);
    }

}
