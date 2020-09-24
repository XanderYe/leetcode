package easy;

import structure.TreeNode;

import java.util.*;

/**
 * Created on 2020/9/24.
 * @see <a href="https://leetcode-cn.com/problems/find-mode-in-binary-search-tree/">501. 二叉搜索树中的众数</a>
 * @author 叶振东
 */
public class No501FindModeInBinarySearchTree {
    Map<Integer, Integer> map;
    public int[] findMode(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        map = new HashMap<>();
        dfs(root);
        int max = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            max = Math.max(max, entry.getValue());
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                ans.add(entry.getKey());
            }
        }
        return ans.stream().mapToInt(Integer::valueOf).toArray();
    }

    public void dfs(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        map.merge(treeNode.val, 1, Integer::sum);
        dfs(treeNode.left);
        dfs(treeNode.right);
    }

    public static void main(String[] args) {
        TreeNode treeNode = TreeNode.create(1,null,2,2);
        int[] ans = new No501FindModeInBinarySearchTree().findMode(treeNode);
        System.out.println(Arrays.toString(ans));
    }
}
