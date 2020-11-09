package util;

import java.util.Arrays;

/**
 * Created on 2020/11/9.
 *
 * @author 叶振东
 */
public class QuickSort {

    public static void sort(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
    }

    private static void quickSort(int[] nums, int low, int high) {
        if (low <high) {
            int k = partition(nums, low, high);
            quickSort(nums, low, k - 1);
            quickSort(nums, k + 1, high);
        }
    }

    private static int partition(int[] nums, int low, int high) {
        int pivot = nums[low];
        while (low < high) {
            while (low < high && nums[high] >= pivot) {
                high--;
            }
            nums[low] = nums[high];
            while (low < high && nums[low] < pivot) {
                low++;
            }
            nums[high] = nums[low];
        }
        nums[low] = pivot;
        return low;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,8,4,7,3,7,1};
        QuickSort.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
