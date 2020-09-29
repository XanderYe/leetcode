package medium;

/**
 * Created on 2020/9/29.
 * @see <a href="https://leetcode-cn.com/problems/unique-paths/comments/">62. 不同路径</a>
 * @author 叶振东
 */
public class No62UniquePaths {
    public int uniquePaths(int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 1;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        System.out.println(new No62UniquePaths().uniquePaths(3, 2));
    }
}
