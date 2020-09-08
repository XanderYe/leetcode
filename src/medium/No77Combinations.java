package medium;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * Created on 2020/9/8.
 * @see <a href="https://leetcode-cn.com/problems/combinations/">77. 组合</a>
 * @author 叶振东
 */
public class No77Combinations {
    Deque<Integer> deque;
    List<List<Integer>> ans;

    public List<List<Integer>> combine(int n, int k) {
        deque = new LinkedList<>();
        ans = new ArrayList<>();
        dfs(n, k, 1);
        return ans;
    }

    public void dfs(int n, int k, int start) {
        if (deque.size() == k) {
            ans.add(new ArrayList<>(deque));
            return;
        }
        for (int i = start; i <= n; i++) {
            deque.addLast(i);
            dfs(n, k, i + 1);
            deque.removeLast();
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> ans = new No77Combinations().combine(4, 2);
        System.out.println(ans.toString());
    }
}
