package medium;

import structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2020/9/14.
 * @see <a href="https://leetcode-cn.com/problems/binary-tree-inorder-traversal">94. 二叉树的中序遍历</a>
 * @author 叶振东
 */
public class No94BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        inorder(root, ans);
        return ans;
    }

    public void inorder(TreeNode treeNode, List<Integer> ans) {
        if (treeNode == null) {
            return;
        }
        inorder(treeNode.left, ans);
        ans.add(treeNode.val);
        inorder(treeNode.right, ans);
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        left.left = new TreeNode(4);
        left.right = new TreeNode(7);
        right.left = new TreeNode(5);
        right.right = new TreeNode(6);
        treeNode.left = left;
        treeNode.right = right;
        System.out.println(new No94BinaryTreeInorderTraversal().inorderTraversal(treeNode));
    }
}
