package easy;

/**
 * @author XanderYe
 * @see <a href="https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock-ii/">122. 买卖股票的最佳时机 II</a>
 * @date 2020/11/8 10:17
 */
public class No122BestTimeToBuyAndSellStockII {
    public int maxProfit(int[] prices) {
        int ans = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                ans += prices[i] - prices[i -1];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] prices = new int[]{7,6,4,3,1};
        System.out.println(new No122BestTimeToBuyAndSellStockII().maxProfit(prices));
    }
}
