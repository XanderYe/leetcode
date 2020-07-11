package hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created on 2020/7/11.
 *
 * @author 叶振东
 */
public class No315CountOfSmallerNumbersAfterSelf {
    public List<Integer> countSmaller(int[] nums) {
        /*int length = nums.length;
        if (length == 0) {
            return new ArrayList<>();
        }
        int[] sorted = new int[length];
        sorted[0] = nums[length - 1];
        List<Integer> ans = new ArrayList<>();
        ans.add(0);
        for (int i = length - 2; i >= 0; i--) {
            int l = 0;
            int r = length - i - 2;
            int key = nums[i];
            int index = binarySearch(sorted, l, r, key);
            System.arraycopy(sorted, index, sorted, index + 1, sorted.length - 1 - index);
            sorted[index] = nums[i];
            ans.add(index);
        }
        Collections.reverse(ans);
        return ans;*/
        return null;
    }

    public int binarySearch(int[] sorted, int l, int r, int key){
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (key < sorted[mid]) {
                r = mid - 1;
            } else if (key > sorted[mid]) {
                l = mid + 1;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1,-1};
        List<Integer> integerList = new No315CountOfSmallerNumbersAfterSelf().countSmaller(nums);
        System.out.println(integerList.toString());
    }
}
