package util;

/**
 * Created on 2020/12/1.
 *
 * @author XanderYe
 */
public class BinarySearch {
    public static int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length - 1, target);
    }

    private static int binarySearch(int[] nums, int left, int right, int target) {
        if (target > nums[right] || left > right) {
            return -1;
        }
        int mid = (right - left) / 2 + left;
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] < target) {
            return binarySearch(nums, mid + 1, right, target);
        } else {
            return binarySearch(nums, left, mid - 1, target);
        }
    }

    private static int binarySearch2(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        if (target > nums[right]) {
            return -1;
        }
        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{1, 2, 3, 4, 5}, 5));
    }
}
