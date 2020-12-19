package medium;

/**
 * @author XanderYe
 * @see <a href="https://leetcode-cn.com/problems/rotate-image/">48. 旋转图像</a>
 * @date 2020/12/19 9:52
 */
public class No48RotateImage {
    public void rotate(int[][] matrix) {
        int abs1 = 0;
        int abs2 = matrix.length - 1;
        while (abs1 <= abs2) {
            int p1 = abs1;
            int p2 = abs2;
            while (p1 != abs2) {
                int temp = matrix[abs1][p1];
                matrix[abs1][p1] = matrix[p2][abs1];
                matrix[p2][abs1] = matrix[abs2][p2];
                matrix[abs2][p2] = matrix[p1][abs2];
                matrix[p1][abs2] = temp;
                p1 += 1;
                p2 -= 1;
            }
            abs1 += 1;
            abs2 -= 1;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        new No48RotateImage().rotate(matrix);
    }
}
