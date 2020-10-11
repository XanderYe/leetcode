package medium;

import java.util.Arrays;

/**
 * @author XanderYe
 * @see <a href="https://leetcode-cn.com/problems/partition-equal-subset-sum/">416. 分割等和子集</a>
 * @date 2020/10/11 9:56
 */
public class No416PartitionEqualSubsetSum {
    public boolean canPartition(int[] nums) {
        int len = nums.length;
        if (len < 2) {
            return false;
        }
        int sum = 0, maxNum = 0;
        for (int num : nums) {
            sum += num;
            maxNum = Math.max(maxNum, num);
        }
        if (sum % 2 != 0) {
            return false;
        }
        int target = sum / 2;
        boolean[][] dp = new boolean[len][target + 1];
        for (int i = 0; i < len; i++) {
            dp[i][0] = true;
        }
        for (int i = 1; i < len; i++) {
            int num = nums[i];
            for (int j = 0; j <= target; j++) {
                dp[i][j] = dp[i - 1][j];
                if (j >= num) {
                    dp[i][j] = dp[i][j] || dp[i - 1][j - num];
                }
            }
        }
        return dp[len - 1][target];
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,5,5,11};
        System.out.println(new No416PartitionEqualSubsetSum().canPartition(nums));
    }
}
