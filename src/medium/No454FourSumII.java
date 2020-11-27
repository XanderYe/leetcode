package medium;

import java.util.HashMap;
import java.util.Map;

/**
 * Created on 2020/11/27.
 * @see <a href="https://leetcode-cn.com/problems/4sum-ii/">454. 四数相加 II</a>
 * @author 叶振东
 */
public class No454FourSumII {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> abMap = new HashMap<>();
        for (int a : A) {
            for (int b : B) {
                abMap.merge(a + b, 1, Integer::sum);
            }
        }
        int count = 0;
        for (int c : C) {
            for (int d : D) {
                count += abMap.getOrDefault(-(c + d), 0);
            }
        }
        return count;
    }
}
