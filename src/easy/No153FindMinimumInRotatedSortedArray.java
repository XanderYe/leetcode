package easy;

/**
 * Created on 2020/7/22.
 *
 * @author 叶振东
 */
public class No153FindMinimumInRotatedSortedArray {
    public int findMin(int[] nums) {
        int min = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }
        return min;
    }

    public int minArray(int[] numbers) {
        int l = 0, r = numbers.length - 1;
        if (numbers[l] < numbers[r]) {
            return numbers[l];
        }
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (numbers[mid] < numbers[r]) {
                r = mid;
            } else if (numbers[mid] > numbers[r]) {
                l = mid + 1;
            } else {
                r--;
            }
        }
        return numbers[l];
    }

    public static void main(String[] args) {
        //int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        int[] nums = new int[]{2, 2, 2, 0, 2};
        System.out.println(new No153FindMinimumInRotatedSortedArray().minArray(nums));
    }
}
