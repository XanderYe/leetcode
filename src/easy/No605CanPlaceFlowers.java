package easy;

import util.CheckUtil;

/**
 * @author XanderYe
 * @see <a href="https://leetcode-cn.com/problems/can-place-flowers/">605. 种花问题</a>
 * @date 2021/1/1 10:46
 */
public class No605CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        int[] newFlowerbed = new int[len + 2];
        System.arraycopy(flowerbed, 0, newFlowerbed, 1, flowerbed.length);
        for (int i = 1; i <= len; i++) {
            if (newFlowerbed[i - 1] + newFlowerbed[i] + newFlowerbed[i + 1] == 0) {
                newFlowerbed[i] = 1;
                n--;
            }
        }
        return n <= 0;
    }

    public static void main(String[] args) {
        No605CanPlaceFlowers solution = new No605CanPlaceFlowers();
        CheckUtil.check(solution.canPlaceFlowers(new int[]{1,0}, 1) == false);
        CheckUtil.check(solution.canPlaceFlowers(new int[]{1,0,1}, 1) == false);
        CheckUtil.check(solution.canPlaceFlowers(new int[]{0,0,0}, 1) == true);
        CheckUtil.check(solution.canPlaceFlowers(new int[]{1,0,0,0,1}, 1) == true);
        CheckUtil.check(solution.canPlaceFlowers(new int[]{1,0,0,0,1}, 2) == false);
        CheckUtil.check(solution.canPlaceFlowers(new int[]{1,0,0,0,0,1}, 1) == true);
        CheckUtil.check(solution.canPlaceFlowers(new int[]{1,0,1,0,1,0,1}, 1) == false);
        CheckUtil.check(solution.canPlaceFlowers(new int[]{1,0,1,0,1,0,1}, 0) == true);
        CheckUtil.check(solution.canPlaceFlowers(new int[]{0,0,1,0,1}, 1) == true);
    }
}
