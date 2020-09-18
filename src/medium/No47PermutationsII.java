package medium;

import java.util.*;

/**
 * Created on 2020/9/18.
 * @see <a href="https://leetcode-cn.com/problems/permutations-ii/">47. 全排列 II</a>
 * @author 叶振东
 */
public class No47PermutationsII {
    List<List<Integer>> ans;
    Deque<Integer> deque;
    boolean[] used;
    public List<List<Integer>> permuteUnique(int[] nums) {
        ans = new ArrayList<>();
        if (nums.length == 0) {
            return ans;
        }
        used = new boolean[nums.length];
        deque = new LinkedList<>();
        Arrays.sort(nums);
        dfs(nums, 0);
        return ans;
    }
    public void dfs(int[] nums, int depth) {
        if (depth == nums.length) {
            ans.add(new ArrayList<>(deque));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) {
                continue;
            }
            deque.addLast(nums[i]);
            used[i] = true;
            dfs(nums, depth + 1);
            used[i] = false;
            deque.removeLast();
        }
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 2};
        List<List<Integer>> ans = new No47PermutationsII().permuteUnique(nums);
        for (List<Integer> list : ans) {
            System.out.println(list);
        }
    }
}
