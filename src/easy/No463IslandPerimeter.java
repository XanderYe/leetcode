package easy;

/**
 * Created on 2020/10/30.
 * @see <a href="https://leetcode-cn.com/problems/island-perimeter/">463. 岛屿的周长</a>
 * @author 叶振东
 */
public class No463IslandPerimeter {
    int[][] dist = new int[][]{{0, -1}, {-1, 0}, {1, 0}, {0, 1}};

    public int islandPerimeter(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    ans += 4;
                    for (int k = 0; k < 4; k++) {
                        int x = dist[k][0];
                        int y = dist[k][1];
                        if (i + x >= 0 && j + y >= 0 && i + x < m && j + y < n) {
                            if (grid[i + x][j + y] == 1) {
                                ans--;
                            }
                        }
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] grid = new int[][]{
                {0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}
        };
        System.out.println(new No463IslandPerimeter().islandPerimeter(grid));
    }
}
