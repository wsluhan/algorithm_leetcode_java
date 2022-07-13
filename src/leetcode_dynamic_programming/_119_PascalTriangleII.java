package leetcode_dynamic_programming;


import java.util.ArrayList;
import java.util.List;

class Solution119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        res.add(1);

        if (rowIndex == 0) return res;

        for (int i = 1; i <= rowIndex; i++) {
            res.add(0);
            for (int j = i; j > 0; j--) {
                res.set(j, res.get(j) + res.get(j - 1));
            }
        }
        return res;
    }
}

public class _119_PascalTriangleII {

}
