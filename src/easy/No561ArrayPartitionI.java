package easy;

import java.util.Arrays;

/**
 * @author 叶振东
 * @date 2019-06-20
 */
public class No561ArrayPartitionI {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(new No561ArrayPartitionI().arrayPairSum(nums));
    }
}
