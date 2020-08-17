package easy;

import structure.TreeNode;

/**
 * Created on 2020/8/17.
 *
 * @author 叶振东
 */
public class No110BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        return dfs(root) != -1;
    }

    public int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = dfs(root.left);
        if (left == -1) {
            return left;
        }
        int right = dfs(root.right);
        if (right == -1) {
            return right;
        }
        if (Math.abs(left - right) > 1) {
            return -1;
        }
        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        TreeNode treeNode1 = new TreeNode(9);
        TreeNode treeNode2 = new TreeNode(20);
        treeNode.left = treeNode1;
        treeNode2.left = new TreeNode(15);
        treeNode2.right = new TreeNode(7);
        treeNode.right = treeNode2;
        System.out.println(new No110BalancedBinaryTree().isBalanced(treeNode));
    }
}
