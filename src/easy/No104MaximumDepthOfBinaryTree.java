package easy;

import structure.TreeNode;

/**
 * Created on 2020/7/28.
 *
 * @author 叶振东
 */
public class No104MaximumDepthOfBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(9);
        TreeNode t3 = new TreeNode(20);
        t3.left = new TreeNode(15);
        t3.right = new TreeNode(7);
        t1.left = t2;
        t1.right = t3;
        System.out.println(new No104MaximumDepthOfBinaryTree().maxDepth(t1));
    }
}
