package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * @author XanderYe
 * @see <a href="https://leetcode-cn.com/problems/pascals-triangle/">118. 杨辉三角</a>
 * @date 2020/12/6 20:49
 */
public class No118PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    List<Integer> lastRow = ans.get(i - 1);
                    row.add(lastRow.get(j - 1) + lastRow.get(j));
                }
            }
            ans.add(row);
        }
        return ans;
    }

    public static void main(String[] args) {
        List<List<Integer>> ans = new No118PascalsTriangle().generate(5);
        for (List<Integer> row : ans) {
            System.out.println(row.toString());
        }
    }
}
