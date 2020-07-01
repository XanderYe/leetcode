package medium;

/**
 * Created on 2020/7/1.
 *
 * @author 叶振东
 */
public class No718MaximumLengthOfRepeatedSubarray {
    public int findLength(int[] A, int[] B) {
        int[][] dp = new int[A.length][B.length];
        int maxLength = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j]) {
                    if (i == 0 || j == 0 || dp[i - 1][j - 1] == 0) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    }
                    maxLength = Math.max(maxLength, dp[i][j]);
                }
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] A = new int[]{1, 2, 3, 2, 1};
        int[] B = new int[]{3, 2, 1, 4, 7};

        /*int[] A = new int[]{0, 0, 0, 0, 0};
        int[] B = new int[]{0, 0, 0, 0, 0};*/

        /*int[] A = new int[]{5,14,53,80,48};
        int[] B = new int[]{50,47,3,80,83};*/
        System.out.println(new No718MaximumLengthOfRepeatedSubarray().findLength(A, B));
    }
}
