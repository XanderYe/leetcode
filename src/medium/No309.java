package medium;

/**
 * Created on 2020/7/10.
 *
 * @author 叶振东
 */
public class No309 {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        if(n<2)return 0;
        int dp[][]=new int[n][3];
        dp[0][0]=-prices[0];
        for(int i=1;i<n;i++){
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][2] - prices[i]);//对于持股状态，我们要么是之前持有的股份没有卖，要么就是冷冻期不持股，冷冻期过了新买的。
            dp[i][1] = dp[i - 1][0] + prices[i];//对于不持股且在冷冻期，我们肯定是持有股票并且卖了股票，所以有收益。
            dp[i][2] = Math.max(dp[i - 1][1], dp[i - 1][2]);//对于不持股且不在冷冻期，说明我们在i-1天不持有股票，不持有股票有两种状态（在不在冷冻期）。
        }
        return Math.max(dp[n-1][2],dp[n-1][1]);//最后对不持股状态求最大，因为持股是没有意义的，只能是利润减少。
    }
}
