package easy;

import structure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @see <a href="https://leetcode-cn.com/problems/binary-tree-paths/">257. 二叉树的所有路径</a>
 * Created on 2020/9/4.
 * @author 叶振东
 */
public class No257BinaryTreePaths {
    List<String> ans;
    public List<String> binaryTreePaths(TreeNode root) {
        ans = new ArrayList<>();
        LinkedList<Integer> queue = new LinkedList<>();
        dfs(root, queue);
        return ans;
    }
    public void dfs(TreeNode treeNode, LinkedList<Integer> queue) {
        if (treeNode == null) {
            return;
        }
        queue.offer(treeNode.val);
        if (treeNode.left == null && treeNode.right == null) {
            String s = join(queue);
            if (s != null) {
                ans.add(s);
            }
            return;
        }
        if (treeNode.left != null) {
            dfs(treeNode.left, queue);
            queue.removeLast();
        }
        if (treeNode.right != null) {
            dfs(treeNode.right, queue);
            queue.removeLast();
        }

    }

    public String join(LinkedList<Integer> queue) {
        if (queue.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (Integer i : queue) {
            sb.append(i).append("->");
        }
        return sb.toString().substring(0, sb.length() - 2);
    }

    public List<String> binaryTreePaths2(TreeNode root) {
        List<String> res = new ArrayList<>();
        dfs2(root, res, "");
        return res;
    }

    public void dfs2(TreeNode treeNode, List<String> res, String path) {
        if (treeNode == null) {
            return;
        }
        if (treeNode.left == null && treeNode.right == null) {
            res.add(path + treeNode.val);
            return;
        }
        dfs2(treeNode.left, res, path + treeNode.val + "->");
        dfs2(treeNode.right, res, path + treeNode.val + "->");
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        TreeNode t1 = new TreeNode(2);
        t1.right = new TreeNode(5);
        treeNode.left = t1;
        treeNode.right = new TreeNode(3);
        List<String> ans = new No257BinaryTreePaths().binaryTreePaths2(treeNode);
        System.out.println(ans.toString());
    }
}
