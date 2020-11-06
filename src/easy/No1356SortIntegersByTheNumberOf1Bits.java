package easy;

import java.util.Arrays;

/**
 * Created on 2020/11/6.
 * @see <a href="https://leetcode-cn.com/problems/sort-integers-by-the-number-of-1-bits/">1356. 根据数字二进制下 1 的数目排序</a>
 * @author 叶振东
 */
public class No1356SortIntegersByTheNumberOf1Bits {
    public int[] sortByBits(int[] arr) {
        Integer[] nums = new Integer[arr.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }
        Arrays.sort(nums, (o1, o2) -> {
            int i1 = Integer.bitCount(o1);
            int i2 = Integer.bitCount(o2);
            if (i1 == i2) {
                return o1 - o2;
            } else {
                return i1 - i2;
            }
        });
        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }
        return arr;
    }

    public int countOne(int n) {
        int i = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                i++;
            }
            n = n >> 1;
        }
        return i;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1024,512,256,128,64,32,16,8,4,2,1};
        int[] ans = new No1356SortIntegersByTheNumberOf1Bits().sortByBits(arr);
        System.out.println(Arrays.toString(ans));
    }
}
