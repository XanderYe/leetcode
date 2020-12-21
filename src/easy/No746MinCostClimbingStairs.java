package easy;

/**
 * Created on 2020/12/21.
 * @see <a href="https://leetcode-cn.com/problems/min-cost-climbing-stairs/">746. 使用最小花费爬楼梯</a>
 * @author 叶振东
 */
public class No746MinCostClimbingStairs {
    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        int[] dp = new int[len + 1];
        for (int i = 0; i <= len; i++) {
            if (i == 0 || i == 1) {
                dp[i] = cost[i];
            } else {
                int cur = i == len ? 0 : cost[i];
                dp[i] = Math.min(dp[i - 2], dp[i - 1]) + cur;
            }
        }
        return dp[len];
    }

    public static void main(String[] args) {
        System.out.println(new No746MinCostClimbingStairs().minCostClimbingStairs(new int[]{10, 15}));
        System.out.println(new No746MinCostClimbingStairs().minCostClimbingStairs(new int[]{10, 15, 20}));
        System.out.println(new No746MinCostClimbingStairs().minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }
}
