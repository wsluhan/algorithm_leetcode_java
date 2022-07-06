package leetcode_binary_search;

class Solution4 {
    // TODO: binary search


    // O(m+n)
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, j = 0, k = 0, median1 = 0, median2 = 0;
        int len = nums1.length + nums2.length;

        for (int count = 0; count <= len / 2; count++) {
            median1 = median2;
            if (i != nums1.length && j != nums2.length) {
                if (nums1[i] <= nums2[j]) median2 = nums1[i++];
                else median2 = nums2[j++];
            } else {
                if (i != nums1.length) median2 = nums1[i++];
                if (j != nums2.length) median2 = nums2[j++];
            }
        }
        return len % 2 == 0 ? (median1 + median2) / 2.0 : median2;
    }
}


public class _4_MedianTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {2};
        Solution4 slt = new Solution4();
        double res = slt.findMedianSortedArrays(arr1, arr2);
        System.out.println(res);

    }
}
