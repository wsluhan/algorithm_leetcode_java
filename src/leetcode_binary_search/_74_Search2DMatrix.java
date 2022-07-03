package leetcode_binary_search;

class Solution74 {
    public boolean searchMatrix(int[][] matrix, int target) {

        if (target < matrix[0][0] || target > matrix[matrix.length - 1][matrix[0].length - 1]) {
            return false;
        }

        int lo = 0, hi = matrix[0].length - 1;
        int row = 0;
        for (int i = 0; i < matrix.length; i++) {
            if (target >= matrix[i][0] && target <= matrix[i][matrix[i].length - 1]) {
                row = i;
                break;
            }
        }

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (target == matrix[row][mid]) {
                return true;
            } else if (target < matrix[row][mid]) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        return false;
    }

    // brute force
    public boolean searchMatrix2(int[][] matrix, int target) {
        if (target < matrix[0][0] || target > matrix[matrix.length - 1][matrix[0].length - 1]) {
            return false;
        }

        for (int i = 0; i < matrix.length; i++) {
            if (target >= matrix[i][0] && target <= matrix[i][matrix[i].length - 1]) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if(target == matrix[i][j]) return true;
                }
            }
        }
        return false;
    }
}

public class _74_Search2DMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 5;
        Solution74 slt = new Solution74();
        boolean res = slt.searchMatrix(arr, target);
        System.out.println(res);
    }

}
