package easy;

/**
 * @author XanderYe
 * @see <a href="https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/">121. 买卖股票的最佳时机</a>
 * @date 2020/11/8 10:17
 */
public class No121BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {
        int ans = 0;
        for (int i = 0; i < prices.length; i++) {
            int max = prices[i];
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] > prices[i]) {
                    max = Math.max(max, prices[j]);
                }
            }
            if (max > prices[i]) {
                ans = Math.max(ans, max - prices[i]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] prices = new int[]{2,4,1};
        System.out.println(new No121BestTimeToBuyAndSellStock().maxProfit(prices));
    }
}
