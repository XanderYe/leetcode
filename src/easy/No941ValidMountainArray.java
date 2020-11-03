package easy;

/**
 * Created on 2020/11/3.
 * @see <a href="https://leetcode-cn.com/problems/valid-mountain-array/">941. 有效的山脉数组</a>
 * @author 叶振东
 */
public class No941ValidMountainArray {
    public boolean validMountainArray(int[] A) {
        int i = 0;
        int len = A.length;
        while (i + 1 < len && A[i + 1] >= A[i]) {
            i++;
        }
        if (i == 0 || i == len - 1) {
            return false;
        }
        while (i + 1 < len && A[i + 1] < A[i]) {
            i++;
        }
        return i == len - 1;
    }

    public static void main(String[] args) {
        int[] A = new int[] {3,5,5};
        System.out.println(new No941ValidMountainArray().validMountainArray(A));
    }
}
