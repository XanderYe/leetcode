package easy;

import java.util.Arrays;

/**
 * Created on 2020/7/20.
 *
 * @author 叶振东
 */
public class No167TwoSumIIInputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {
        int len = numbers.length;
        int[] ans = new int[2];
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (numbers[i] + numbers[j] == target) {
                    ans[0] = i + 1;
                    ans[1] = j + 1;
                    break;
                }
            }
        }
        return ans;
    }

    public int[] twoSum2(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        while (l < r) {
            int tmp = numbers[l] + numbers[r];
            if (tmp == target) {
                return new int[]{l + 1, r + 1};
            } else if (tmp < target) {
                l++;
            } else {
                r--;
            }
        }
        return new int[]{0, 0};
    }

    public static void main(String[] args) {
        //int[] nums = new int[]{2, 7, 11, 15};
        //int[] ans = new No167TwoSumIIInputArrayIsSorted().twoSum2(nums, 9);
        int[] nums = new int[]{1,2,3,4,4,9,56,90};
        int[] ans = new No167TwoSumIIInputArrayIsSorted().twoSum2(nums, 8);
        System.out.println(Arrays.toString(ans));
    }
}
