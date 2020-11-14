package easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * Created on 2020/11/14.
 * @see <a href="https://leetcode-cn.com/problems/relative-sort-array/">1122. 数组的相对排序</a>
 * @author 叶振东
 */
public class No1122RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> order = new HashMap<>();
        for (int i = 0; i < arr2.length; i++) {
            order.put(arr2[i], i);
        }
        Integer[] nums = new Integer[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            nums[i] = arr1[i];
        }
        Arrays.sort(nums, ((o1, o2) -> {
            if (order.containsKey(o1) || order.containsKey(o2)) {
                return order.getOrDefault(o1, 1001) - order.getOrDefault(o2, 1001);
            }
            return o1 - o2;
        }));
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = nums[i];
        }
        return arr1;
    }

    public static void main(String[] args) {
        int[] arr1 = new int[]{28,6,22,8,44,17};
        int[] arr2 = new int[]{22,28,8,6};
        System.out.println(Arrays.toString(new No1122RelativeSortArray().relativeSortArray(arr1, arr2)));
    }
}
