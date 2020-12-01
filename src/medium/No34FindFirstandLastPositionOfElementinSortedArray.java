package medium;

import java.util.Arrays;

/**
 * Created on 2020/12/1.
 * @see <a href="https://leetcode-cn.com/problems/find-first-and-last-position-of-element-in-sorted-array/">34. 在排序数组中查找元素的第一个和最后一个位置</a>
 * @author 叶振东
 */
public class No34FindFirstandLastPositionOfElementinSortedArray {
    public int[] searchRange(int[] nums, int target) {
        int leftIdx = binarySearch(nums, target, true);
        int rightIdx = binarySearch(nums, target, false) - 1;
        if (leftIdx <= rightIdx && rightIdx < nums.length && nums[leftIdx] == target && nums[rightIdx] == target) {
            return new int[]{leftIdx, rightIdx};
        }
        return new int[]{-1, -1};
    }

    public int binarySearch(int[] nums, int target, boolean lower) {
        int left = 0, right = nums.length - 1, ans = nums.length;
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (nums[mid] > target || (lower && nums[mid] >= target)) {
                right = mid - 1;
                ans = mid;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5, 7, 7, 8, 8, 10};
        int[] ans = new No34FindFirstandLastPositionOfElementinSortedArray().searchRange(nums, 8);
        System.out.println(Arrays.toString(ans));
    }
}
