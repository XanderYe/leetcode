package easy;

import java.util.Arrays;

/**
 * Created on 2020/11/17.
 * @see <a href="https://leetcode-cn.com/problems/matrix-cells-in-distance-order/">1030. 距离顺序排列矩阵单元格</a>
 * @author 叶振东
 */
public class No1030MatrixCellsInDistanceOrder {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] ans = new int[R * C][2];
        int index = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                ans[index++] = new int[]{i, j};
            }
        }
        Arrays.sort(ans, (o1, o2) -> {
            int l1 = Math.abs(o1[0] - r0) + Math.abs(o1[1] - c0);
            int l2 = Math.abs(o2[0] - r0) + Math.abs(o2[1] - c0);
            return l1 - l2;
        });
        return ans;
    }
}
