package medium;

/**
 * Created on 2020/6/28.
 *
 * @author 叶振东
 */
public class No209MinimumSizeSubarraySum {
    // 暴力
    public int minSubArrayLen(int s, int[] nums) {
        int length = nums.length;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < length; i++) {
            int sum = nums[i];
            if (sum >= s) {
                return 1;
            }
            for (int j = i; j < length; j++) {
                sum += nums[j];
                if (sum >= s) {
                    min = Math.min(j - i + 1, min);
                    break;
                }
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }

    // 队列
    public int minSubArrayLen1(int s, int[] nums) {
        int head = 0, tail = 0, sum = 0, min = Integer.MAX_VALUE;
        while(tail < nums.length) {
            sum += nums[tail++];
            while (sum >= s) {
                min = Math.min(min, tail - head);
                sum -= nums[head++];
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }

    public static void main(String[] args) {
        //System.out.println(new No209MinimumSizeSubarraySum().minSubArrayLen(15, new int[]{1,2,3,4,5}));
        System.out.println(new No209MinimumSizeSubarraySum().minSubArrayLen(7, new int[]{2, 3, 1, 2, 4, 3}));
    }
}
