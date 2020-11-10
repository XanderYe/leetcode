package medium;

import java.util.Arrays;

/**
 * Created on 2020/11/10.
 * @see <a href="https://leetcode-cn.com/problems/next-permutation/">31. 下一个排列</a>
 * @author 叶振东
 */
public class No31NextPermutation {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[i] >= nums[j]) {
                j--;
            }
            swap(nums, i, j);
        }
        reverse(nums, i + 1);
    }

    public void swap(int[] nums, int a, int b) {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }

    public void reverse(int[] nums, int start) {
        int left = start, right = nums.length - 1;
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3,2,1};
        new No31NextPermutation().nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}
