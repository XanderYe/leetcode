package medium;

import structure.TreeNode;

public class No114FlattenBinaryTreeToLinkedList {
    TreeNode tmp = null;
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }
        flatten(root.left);
        flatten(root.right);

        tmp = root.right;
        root.right = root.left;
        root.left = null;
        while (root.right != null) {
            root = root.right;
        }
        root.right = tmp;
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(5);
        t2.left=new TreeNode(3);
        t2.right=new TreeNode(4);
        t3.right=new TreeNode(5);
        t1.left = t2;
        t1.right = t3;
        new No114FlattenBinaryTreeToLinkedList().flatten(t1);
    }
}
