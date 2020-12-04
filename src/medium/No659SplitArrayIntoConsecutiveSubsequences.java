package medium;

import java.util.*;

/**
 * Created on 2020/12/4.
 * @see <a href="https://leetcode-cn.com/problems/split-array-into-consecutive-subsequences/">659. 分割数组为连续子序列</a>
 * @author 叶振东
 */
public class No659SplitArrayIntoConsecutiveSubsequences {
    public boolean isPossible(int[] nums) {
        Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        for (int x : nums) {
            if (!map.containsKey(x)) {
                map.put(x, new PriorityQueue<>());
            }
            if (map.containsKey(x - 1)) {
                int prevLength = map.get(x - 1).poll();
                if (map.get(x - 1).isEmpty()) {
                    map.remove(x - 1);
                }
                map.get(x).offer(prevLength + 1);
            } else {
                map.get(x).offer(1);
            }
        }
        Set<Map.Entry<Integer, PriorityQueue<Integer>>> entrySet = map.entrySet();
        for (Map.Entry<Integer, PriorityQueue<Integer>> entry : entrySet) {
            PriorityQueue<Integer> queue = entry.getValue();
            if (queue.peek() < 3) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new No659SplitArrayIntoConsecutiveSubsequences().isPossible(new int[]{1,2,3,3,4,5}));
        System.out.println(new No659SplitArrayIntoConsecutiveSubsequences().isPossible(new int[]{1,2,3,3,4,4,5,5}));
        System.out.println(new No659SplitArrayIntoConsecutiveSubsequences().isPossible(new int[]{1,2,3,4,4,5}));
        System.out.println(new No659SplitArrayIntoConsecutiveSubsequences().isPossible(new int[]{1,2,3}));
    }
}
