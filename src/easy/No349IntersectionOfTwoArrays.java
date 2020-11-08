package easy;

import java.util.*;

/**
 * Created on 2020/11/2.
 * @see <a href="https://leetcode-cn.com/problems/intersection-of-two-arrays/">349. 两个数组的交集</a>
 * @author 叶振东
 */
public class No349IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int l1 = 0;
        int l2 = 0;
        Set<Integer> set = new HashSet<>();
        while (l1 < nums1.length && l2 < nums2.length) {
            if (nums1[l1] == nums2[l2]) {
                set.add(nums1[l1]);
                l1++;
                l2++;
            } else if (nums1[l1] < nums2[l2]) {
                l1++;
            } else {
                l2++;
            }
        }
        int[] ans = new int[set.size()];
        int index = 0;
        for (Integer integer : set) {
            ans[index++] = integer;
        }
        return ans;
    }

    public static void main(String[] args) {
        //int[] nums1 = new int[]{1,2,2,1}, nums2 = new int[]{2,2};
        int[] nums1 = new int[]{4,9,5}, nums2 = new int[]{9,4,9,8,4};
        System.out.println(Arrays.toString(new No349IntersectionOfTwoArrays().intersection(nums1, nums2)));
    }
}
