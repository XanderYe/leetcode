package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created on 2020/9/10.
 * @see <a href="https://leetcode-cn.com/problems/combination-sum-iii/">40. 组合总和 III</a>
 * @author 叶振东
 */
public class No216CombinationSumIII {
    List<List<Integer>> ans = null;
    LinkedList<Integer> queue = null;

    public List<List<Integer>> combinationSum3(int k, int n) {
        ans = new ArrayList<>();
        queue = new LinkedList<>();
        dfs(k, n, n, 1);
        return ans;
    }

    public void dfs(int k, int n, int target, int start) {
        if (queue.size() > k || target < 0) {
            return;
        }
        if (queue.size() == k) {
            if (target == 0) {
                ans.add(new ArrayList<>(queue));
            }
            return;
        }
        for (int i = start; i <= 9; i++) {
            queue.addLast(i);
            dfs(k, n, target - i, i + 1);
            queue.removeLast();
        }
    }

    public static void main(String[] args) {
        System.out.println(new No216CombinationSumIII().combinationSum3(3, 15));
    }
}
