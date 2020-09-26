package medium;

import structure.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author XanderYe
 * @see <a href="https://leetcode-cn.com/problems/path-sum-ii/submissions/">113. 路径总和 II</a>
 * @date 2020/9/26 16:01
 */
public class No113PathSumII {
    List<List<Integer>> ans;
    Deque<Integer> deque;
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        ans = new ArrayList<>();
        deque = new ArrayDeque<>();
        dfs(root, sum);
        return ans;
    }

    public void dfs(TreeNode root, int sum) {
        if (root == null) {
            return;
        }
        deque.add(root.val);
        if (sum == root.val && root.left == null && root.right == null) {
            ans.add(new ArrayList<>(deque));
        }
        dfs(root.left, sum - root.val);
        dfs(root.right, sum - root.val);
        deque.removeLast();
    }

    public static void main(String[] args) {
        TreeNode treeNode = TreeNode.create(5,4,8,11,null,13,4,7,2,null,null,5,1);
        List<List<Integer>> ans = new No113PathSumII().pathSum(treeNode, 22);
        System.out.println(ans.toString());
    }
}
