package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created on 2020/7/14.
 *
 * @author 叶振东
 */
public class No120Triangle {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int m = triangle.get(n - 1).size();
        int[][] dp = new int[n + 1][m + 1];
        dp[0][0] = 0;
        int max = Integer.MAX_VALUE;
        for (int i = 1; i <= m; i++) {
            List<Integer> row = triangle.get(i - 1);
            for (int j = 1; j <= row.size(); j++) {
                if (j == 1) {
                    dp[i][j] = dp[i - 1][j] + row.get(j - 1);
                } else if (j == row.size()) {
                    dp[i][j] = dp[i - 1][j - 1] + row.get(j - 1);
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j - 1], dp[i - 1][j]) + row.get(j - 1);
                }
                if (i == m) {
                    max = Math.min(max, dp[i][j]);
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(2);
        List<Integer> l2 = Arrays.asList(3, 4);
        List<Integer> l3 = Arrays.asList(6, 5, 7);
        List<Integer> l4 = Arrays.asList(4, 1, 8, 3);
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(l1);
        triangle.add(l2);
        triangle.add(l3);
        triangle.add(l4);
        System.out.println(new No120Triangle().minimumTotal(triangle));
    }
}
