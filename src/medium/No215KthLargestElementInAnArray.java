package medium;

import java.util.Arrays;

/**
 * Created on 2020/6/29.
 *
 * @author 叶振东
 */
public class No215KthLargestElementInAnArray {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }

    public static void main(String[] args) {
        System.out.println(new No215KthLargestElementInAnArray().findKthLargest(new int[]{3,2,3,1,2,4,5,5,6}, 4));
    }
}
