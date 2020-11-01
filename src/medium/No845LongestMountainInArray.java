package medium;

/**
 * Created on 2020/10/25.
 * @see <a href="https://leetcode-cn.com/problems/longest-mountain-in-array/">845. 数组中的最长山脉</a>
 * @author 叶振东
 */
public class No845LongestMountainInArray {
    public int longestMountain(int[] A) {
        int len = A.length;
        int longest = 0;
        int vally = -1;
        int k = 1;
        while (k < len) {
            int diff = A[k] - A[k - 1];
            if (diff > 0 && vally == -1) {
                vally = k - 1;
            } else if (diff < 0 && vally != -1) {
                while (++k < len && (diff = A[k] - A[k - 1]) < 0);
                longest = Math.max(longest, k - vally);
                vally = diff > 0 ? k - 1 : -1;
                continue;
            } else if (diff == 0) {
                vally = -1;
            }
            k++;
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] A = new int[]{1,2,3,4,5,6,5,4,3,2,1};
        System.out.println(new No845LongestMountainInArray().longestMountain(A));
    }
}
