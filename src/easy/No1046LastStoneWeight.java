package easy;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * Created on 2020/12/30.
 * @see <a href="https://leetcode-cn.com/problems/last-stone-weight/">1046. 最后一块石头的重量</a>
 * @author 叶振东
 */
public class No1046LastStoneWeight {
    public int lastStoneWeight(int[] stones) {
        if (stones.length == 1) {
            return stones[0];
        }
        Arrays.sort(stones);
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((i1, i2) -> i2 - i1);
        for (int stone : stones) {
            priorityQueue.offer(stone);
        }
        while (priorityQueue.size() > 1) {
            int a = priorityQueue.poll();
            int b = priorityQueue.poll();
            if (a != b) {
                priorityQueue.offer(Math.abs(a - b));
            }
        }
        return priorityQueue.size() == 0 ? 0 : priorityQueue.poll();
    }

    public static void main(String[] args) {
        System.out.println(new No1046LastStoneWeight().lastStoneWeight(new int[]{2,2}));
        System.out.println(new No1046LastStoneWeight().lastStoneWeight(new int[]{2,7,4,1,8,1}));
    }
}
