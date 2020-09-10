package medium;

import java.util.*;

/**
 * Created on 2020/9/10.
 * @see <a href="https://leetcode-cn.com/problems/combination-sum-ii">40. 组合总和 II</a>
 * @author 叶振东
 */
public class No40CombinationSumII {
    List<List<Integer>> ans = null;
    LinkedList<Integer> queue = null;

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if (candidates.length == 0) {
            return new ArrayList<>();
        }
        ans = new ArrayList<>();
        queue = new LinkedList<>();
        // 排序用来剪枝
        Arrays.sort(candidates);
        dfs(candidates, target, 0);
        return ans;
    }

    public void dfs(int[] candidates, int target, int start) {
        if (target < 0) {
            return;
        }
        if (target == 0) {
            ans.add(new ArrayList<>(queue));
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (target - candidates[i] < 0) {
                break;
            }
            if (i > start && candidates[i] == candidates[i - 1]) {
                continue;
            }
            queue.addLast(candidates[i]);
            dfs(candidates, target - candidates[i], i + 1);
            queue.removeLast();
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{10,1,2,7,6,1,5};
        System.out.println(new No40CombinationSumII().combinationSum2(nums, 8));
    }
}
