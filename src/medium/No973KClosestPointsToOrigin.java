package medium;

import java.util.Arrays;

/**
 * Created on 2020/11/9.
 * @see <a href="https://leetcode-cn.com/problems/k-closest-points-to-origin/">973. 最接近原点的 K 个点</a>
 * @author 叶振东
 */
public class No973KClosestPointsToOrigin {
    public int[][] kClosest(int[][] points, int K) {
        quickSort(points, 0, points.length - 1, K);
        int[][] ans = new int[K][2];
        System.arraycopy(points, 0, ans, 0, K);
        return ans;
    }

    public void quickSort(int[][] points, int low, int high, int k) {
        if (low < high) {
            int index = partition(points, low, high);
            if (index == k) {
                return;
            }
            quickSort(points, low, index - 1, k);
            if (k > index) {
                quickSort(points, index + 1, high, k);
            }
        }
    }

    public int partition(int[][] points, int l, int r) {
        int[] tmp = points[l];
        while (l < r) {
            while (l < r && dest(points[r]) >= dest(tmp)) {
                r--;
            }
            points[l] = points[r];
            while (l < r && dest(points[l]) <= dest(tmp)) {
                l++;
            }
            points[r] = points[l];
        }
        points[l] = tmp;
        return l;
    }

    public double dest(int[] point) {
        return Math.sqrt(Math.pow(point[0], 2) + Math.pow(point[1], 2));
    }

    public int[][] kClosest2(int[][] points, int K) {
        Arrays.sort(points, ((o1, o2) -> {
            double v1 = Math.abs(Math.sqrt(Math.pow(o1[0], 2) + Math.pow(o1[1], 2)));
            double v2 = Math.abs(Math.sqrt(Math.pow(o2[0], 2) + Math.pow(o2[1], 2)));
            return v1 > v2 ? 1 : -1;
        }));
        int[][] ans = new int[K][2];
        System.arraycopy(points, 0, ans, 0, K);
        return ans;
    }

    public static void main(String[] args) {
        int[][] points = new int[][]{
                {1, 3},
                {-2, 2}
        };
        int[][] ans = new No973KClosestPointsToOrigin().kClosest(points, 1);
        for (int[] num : ans) {
            System.out.println(Arrays.toString(num));
        }
    }
}
