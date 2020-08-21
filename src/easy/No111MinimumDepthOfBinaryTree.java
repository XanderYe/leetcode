package easy;

import structure.TreeNode;

/**
 * Created on 2020/8/21.
 *
 * @author 叶振东
 */
public class No111MinimumDepthOfBinaryTree {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        int minDepth = Integer.MAX_VALUE;
        if (root.left != null) {
            minDepth = Math.min(minDepth(root.left), minDepth);
        }
        if (root.right != null) {
            minDepth = Math.min(minDepth(root.right), minDepth);
        }
        return minDepth + 1;
    }

    public static void main(String[] args) {
        /*TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        TreeNode treeNode = new TreeNode(20);
        treeNode.left = new TreeNode(15);
        treeNode.right = new TreeNode(7);
        root.right = treeNode;*/
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        System.out.println(new No111MinimumDepthOfBinaryTree().minDepth(root));
    }
}
