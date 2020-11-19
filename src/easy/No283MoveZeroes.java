package easy;

import java.util.Arrays;

/**
 * Created on 2020/11/19.
 * @see <a href="https://leetcode-cn.com/problems/move-zeroes/">283. 移动零</a>
 * @author 叶振东
 */
public class No283MoveZeroes {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int index = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i] != 0) {
                nums[index++] = nums[i];
            }
        }
        for (int i = index; i < len; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,1,0,3,12};
        //int[] nums = new int[]{0,0,1};
        new No283MoveZeroes().moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
