package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Xander on 2018-09-18.
 */
public class No1TwoSum {
    public int[] twoSum(Integer[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No solution");
    }

    public int[] twoSum2(Integer[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] ans = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                ans[0] = i;
                ans[1] = map.get(nums[i]);
            }
            map.put(target - nums[i], i);
        }
        return ans;
    }

    public static void main(String[] args) {
        No1TwoSum no1TwoSum = new No1TwoSum();
        Integer[] nums = {2, 7, 11, 15};
        List<Integer> list=Arrays.asList(nums);
        List<Integer> list2=list.stream().map(i -> i*2).collect(Collectors.toList());
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(Arrays.toString(list2.toArray()));
        //System.out.println(Arrays.toString(no1TwoSum.twoSum(nums, 9)));
    }
}
