package easy;

import java.util.Arrays;

/**
 * @author XanderYe
 * @see <a href="https://leetcode-cn.com/problems/largest-perimeter-triangle/">976. 三角形的最大周长</a>
 * @date 2020/11/29 20:15
 */
public class No976LargestPerimeterTriangle {
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for (int i = A.length - 1; i >= 2; i--) {
            int a = A[i];
            int b = A[i - 1];
            int c = A[i - 2];
            if (b + c > a) {
                return a + b + c;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        No976LargestPerimeterTriangle solution = new No976LargestPerimeterTriangle();
        System.out.println(solution.largestPerimeter(new int[]{2,1,2}));
        System.out.println(solution.largestPerimeter(new int[]{1,2,1}));
        System.out.println(solution.largestPerimeter(new int[]{3,2,3,4}));
        System.out.println(solution.largestPerimeter(new int[]{3,6,2,3}));
    }
}
