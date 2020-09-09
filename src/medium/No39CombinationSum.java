package medium;

import java.util.*;

/**
 * Created on 2020/9/9.
 * @see <a href="https://leetcode-cn.com/problems/combination-sum/">39. 组合总和</a>
 * @author 叶振东
 */
public class No39CombinationSum {
    List<List<Integer>> ans = null;
    LinkedList<Integer> queue = null;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        ans = new ArrayList<>();
        if (candidates.length == 0) {
            return ans;
        }
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
            queue.addLast(candidates[i]);
            dfs(candidates, target - candidates[i], i);
            queue.removeLast();
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{8,7,4,3};
        List<List<Integer>> ans = new No39CombinationSum().combinationSum(nums, 11);
        System.out.println(ans.toString());
    }
}
