package easy;

/**
 * @author XanderYe
 * @description:
 * @date 2020-08-16 13:57
 */
public class No733FloodFill {

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int curColor = image[sr][sc];
        if (curColor != newColor) {
            dfs(image, sr, sc, curColor, newColor);
        }
        return image;
    }

    public void dfs(int[][] image, int x, int y, int curColor, int newColor) {
        if (x >= image.length || y >= image[0].length || x < 0 || y < 0 || image[x][y] != curColor) {
            return;
        }
        image[x][y] = newColor;
        dfs(image, x - 1, y, curColor, newColor);
        dfs(image, x, y - 1, curColor, newColor);
        dfs(image, x + 1, y, curColor, newColor);
        dfs(image, x, y + 1, curColor, newColor);
    }

    public static void main(String[] args) {
        int[][] image = new int[][]{
                {0, 0, 0},
                {0, 1, 1}
        };
        image = new No733FloodFill().floodFill(image, 1, 1, 1);
        for (int[] ints : image) {
            for (int i : ints) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
