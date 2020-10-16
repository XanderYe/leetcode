package easy;

import java.util.Arrays;

/**
 * Created on 2020/10/16.
 * @see <a href="https://leetcode-cn.com/problems/squares-of-a-sorted-array/">977. 有序数组的平方</a>
 * @author 叶振东
 */
public class No977SquaresOfASortedArray {
    public int[] sortedSquares(int[] A) {
        int start = 0;
        int end = A.length - 1;
        int index = end;
        int[] B = new int[A.length];
        while (start <= end) {
            if (Math.abs(A[start]) < Math.abs(A[end])) {
                B[index] = A[end] * A[end];
                end--;
            } else {
                B[index] = A[start] * A[start];
                start++;
            }
            index--;
        }
        return B;
    }

    public static void main(String[] args) {
        int[] A = new int[]{-7,-3,2,3,11};
        int[] B = new No977SquaresOfASortedArray().sortedSquares(A);
        System.out.println(Arrays.toString(B));
    }
}
