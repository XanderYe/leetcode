package medium;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created on 2020/11/23.
 * @see <a href="https://leetcode-cn.com/problems/minimum-number-of-arrows-to-burst-balloons/">452. 用最少数量的箭引爆气球</a>
 * @author 叶振东
 */
public class No452MinimumNumberOfArrowsToBurstBalloons {
    public int findMinArrowShots(int[][] points) {
        if(points.length < 1) {
            return 0;
        }
        Arrays.sort(points, Comparator.comparingInt(a -> a[1]));
        int count = 1;
        int axis = points[0][1];

        for(int i = 1; i < points.length; ++i) {
            if(axis < points[i][0]) {
                count++;
                axis = points[i][1];
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[][] points = new int[][]{
                {10,16},
                {2,8},
                {1,6},
                {7,12}
        };
        System.out.println(new No452MinimumNumberOfArrowsToBurstBalloons().findMinArrowShots(points));
    }
}
