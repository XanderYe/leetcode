package hard;

/**
 * @author XanderYe
 * @date 2020/6/27
 */
public class No41FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            if (nums[i] <= 0) {
                nums[i] = n + 1;
            }
        }
        for (int i = 0; i < n; ++i) {
            int num = Math.abs(nums[i]);
            if (num <= n) {
                nums[num - 1] = -Math.abs(nums[num - 1]);
            }
        }
        for (int i = 0; i < n; ++i) {
            if (nums[i] > 0) {
                return i + 1;
            }
        }
        return n + 1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1, -2, 4, 3, 2};
        System.out.println(new No41FirstMissingPositive().firstMissingPositive(nums));
    }
}
