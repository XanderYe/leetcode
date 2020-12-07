package medium;

import java.util.Arrays;

/**
 * Created on 2020/12/7.
 * @see <a href="https://leetcode-cn.com/problems/score-after-flipping-matrix/">861. 翻转矩阵后的得分</a>
 * @author 叶振东
 */
public class No861ScoreAfterFlippingMatrix {
    public int matrixScore(int[][] A) {
        int m = A.length;
        int n = A[0].length;
        for (int i = 0; i < m; i++) {
            if (A[i][0] == 0) {
                for (int j = 0; j < n; j++) {
                    A[i][j] = A[i][j] ^ 1;
                }
            }
        }
        for (int j = 1; j < n; j++) {
            int ctn = 0;
            for (int[] ints : A) {
                if (ints[j] == 1) {
                    ctn++;
                }
            }
            if (ctn <= m / 2) {
                for (int i = 0; i < m; i++) {
                    A[i][j] = A[i][j] ^ 1;
                }
            }
        }
        int sum = 0;
        for (int j = n - 1; j >=0; j--) {
            int index = n - 1 - j;
            for (int[] ints : A) {
                sum += Math.pow(2, index) * ints[j];
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] A = new int[][]{{0,0,1,1},{1,0,1,0},{1,1,0,0}};
        System.out.println(new No861ScoreAfterFlippingMatrix().matrixScore(A));
    }
}
