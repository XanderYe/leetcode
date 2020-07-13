package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created on 2020/7/13.
 *
 * @author 叶振东
 */
public class No350IntersectionOfTwoArraysII {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int[] ans = new int[Math.min(nums1.length, nums2.length)];
        int l1 = 0, l2 = 0, index = 0;
        while (l1 < nums1.length && l2 < nums2.length) {
            if (nums1[l1] < nums2[l2]) {
                l1++;
            } else if (nums1[l1] == nums2[l2]) {
                ans[index] = nums1[l1];
                l1++;
                l2++;
                index++;
            } else {
                l2++;
            }
        }
        return Arrays.copyOfRange(ans, 0, index);
    }

    public static void main(String[] args) {
        /*int[] nums1 = new int[]{1,2,2,1};
        int[] nums2 = new int[]{2,2};*/
        int[] nums1 = new int[]{4,9,5};
        int[] nums2 = new int[]{9,4,9,8,4};
        System.out.println(Arrays.toString(new No350IntersectionOfTwoArraysII().intersect(nums1, nums2)));
    }
}
