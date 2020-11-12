package easy;

import java.util.Arrays;

/**
 * Created on 2020/11/12.
 * @see <a href="https://leetcode-cn.com/problems/sort-array-by-parity-ii/">922. 按奇偶排序数组 II</a>
 * @author XanderYe
 */
public class No922SortArrayByParityII {
    public int[] sortArrayByParityII(int[] A) {
        int len  = A.length;
        for (int i = 0; i < len; i++) {
            if (A[i] % 2 != i % 2) {
                for (int j = i + 1; j < len; j++) {
                    if (i % 2 == A[j] % 2) {
                        swap(A, i, j);
                        break;
                    }
                }
            }
        }
        return A;
    }

    public int[] sortArrayByParityII2(int[] A) {
        int[] ans = new int[A.length];
        int ou = 0;
        int ji = 1;
        for (int value : A) {
            if (value % 2 == 0) {
                ans[ou] = value;
                ou += 2;
            } else {
                ans[ji] = value;
                ji += 2;
            }
        }
        return ans;
    }

    public void swap(int[] nums, int a, int b) {
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
    }

    public static void main(String[] args) {
        int[] A = new int[]{4,2,5,7};
        int[] ans = new No922SortArrayByParityII().sortArrayByParityII(A);
        System.out.println(Arrays.toString(ans));
    }
}
