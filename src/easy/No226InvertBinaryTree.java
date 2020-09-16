package easy;

import structure.TreeNode;

/**
 * Created on 2020/9/16.
 * @see <a href="https://leetcode-cn.com/problems/invert-binary-tree/solution/fan-zhuan-er-cha-shu-by-leetcode-solution/">226. 翻转二叉树</a>
 * @author 叶振东
 */
public class No226InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }

    public static void dfs(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        System.out.println(treeNode.val);
        dfs(treeNode.left);
        dfs(treeNode.right);
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(4);
        TreeNode treeNode1 = new TreeNode(2);
        TreeNode treeNode2 = new TreeNode(7);
        treeNode1.left = new TreeNode(1);
        treeNode1.right = new TreeNode(3);
        treeNode2.left = new TreeNode(6);
        treeNode2.right = new TreeNode(9);
        treeNode.left = treeNode1;
        treeNode.right = treeNode2;
        dfs(treeNode);
        new No226InvertBinaryTree().invertTree(treeNode);
        System.out.println();
        dfs(treeNode);
    }
}
