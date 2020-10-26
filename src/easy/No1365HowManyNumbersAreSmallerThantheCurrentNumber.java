package easy;

import java.util.*;

/**
 * Created on 2020/10/26.
 * @see <a href="https://leetcode-cn.com/problems/how-many-numbers-are-smaller-than-the-current-number/">1365. 有多少小于当前数字的数字</a>
 * @author 叶振东
 */
public class No1365HowManyNumbersAreSmallerThantheCurrentNumber {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];
        int index = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, 0);
            ans[index++] = num;
        }
        Arrays.sort(nums);
        for (int i = 1; i < len; i++) {
            if (nums[i] == nums[i - 1]) {
                map.put(nums[i], map.get(nums[i-1]));
            } else {
                map.put(nums[i], i);
            }
        }
        index = 0;
        for (int num : ans) {
            ans[index++] = map.get(num);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] test = new int[]{8,1,2,2,3};
        int[] ans = new No1365HowManyNumbersAreSmallerThantheCurrentNumber().smallerNumbersThanCurrent(test);
        System.out.println(Arrays.toString(ans));
    }
}
