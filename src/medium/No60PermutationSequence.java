package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author XanderYe
 * @see <a href="https://leetcode-cn.com/problems/permutation-sequence/submissions/">60. 第k个排列</a>
 * @date 2020/9/5 22:03
 */
public class No60PermutationSequence {
    public String getPermutation(int n, int k) {
        List<Integer> candidates = new ArrayList<>();
        int[] factorials = new int[n+1];
        factorials[0] = 1;
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            candidates.add(i);
            fact *= i;
            factorials[i] = fact;
        }
        k-=1;
        StringBuilder sb = new StringBuilder();
        for (int i = n - 1; i >= 0; i--) {
            int index = k / factorials[i];
            sb.append(candidates.remove(index));
            k -= index * factorials[i];
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new No60PermutationSequence().getPermutation(3, 3));
    }
}
