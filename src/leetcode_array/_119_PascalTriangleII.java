package leetcode_array;

import java.util.ArrayList;
import java.util.List;


class Solution119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        res.add(1);

        if (rowIndex == 0) return res;

        for (int i = 1; i < rowIndex + 1; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    temp.add(1);
                } else {
                    temp.add(res.get(j - 1) + res.get(j));
                }
            }
            res = temp;
        }
        return res;
    }
}

public class _119_PascalTriangleII {
}
