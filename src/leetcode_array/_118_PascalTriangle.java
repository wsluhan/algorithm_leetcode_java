package leetcode_array;

import java.util.ArrayList;
import java.util.List;

class Solution118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if (numRows == 0) return res;

        ArrayList<Integer> base = new ArrayList<>();
        base.add(1);
        res.add(base);
        if (numRows == 1) return res;

        for (int i = 1; i < numRows; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(1);
            for (int j = 1; j < i; j++) {
                temp.add(res.get(i - 1).get(j - 1) + res.get(i - 1).get(j));
            }
            temp.add(1);
            res.add(temp);
        }

        return res;
    }
}

public class _118_PascalTriangle {
    public static void main(String[] args) {
        Solution118 slt = new Solution118();

    }
}
