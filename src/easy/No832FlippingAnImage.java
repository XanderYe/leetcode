package easy;

/**
 * Created by Xander on 2018-10-12.
 */
public class No832FlippingAnImage {
    public static void main(String[] args) {
        int array1[][] = new int[][]{{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int array2[][] = new int[][]{{1, 1, 0, 0}, {1, 0, 0, 1}, {0, 1, 1, 1}, {1, 0, 1, 0}};
        System.out.println("翻转前");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }
        int[][] B = new No832FlippingAnImage().flipAndInvertImage(array2);
        System.out.println("翻转后");
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].length; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int[][] flipAndInvertImage(int[][] A) {
        int x = A.length;
        int y = A[0].length;
        int[][] B = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                B[i][j] = A[i][y - j - 1] ^ 1;
            }
        }
        return B;
    }
}
