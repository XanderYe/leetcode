package medium;

import structure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created on 2020/10/27.
 * @see <a href="https://leetcode-cn.com/problems/binary-tree-preorder-traversal/">144. 二叉树的前序遍历</a>
 * @author 叶振东
 */
public class No144BinaryTreePreorderTraversal {
    List<Integer> ans = new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return ans;
        }
        ans.add(root.val);
        preorderTraversal(root.left);
        preorderTraversal(root.right);
        return ans;
    }

    /**
     * 迭代
     * @param root
     * @return java.util.List<java.lang.Integer>
     * @author yezhendong
     * @date 2020/10/27
     */
    public List<Integer> preorderTraversal2(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        LinkedList<TreeNode> stack = new LinkedList<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode treeNode = stack.pop();
            ans.add(treeNode.val);
            if (treeNode.right != null) {
                stack.push(treeNode.right);
            }
            if (treeNode.left != null) {
                stack.push(treeNode.left);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        TreeNode treeNode = TreeNode.create(1,null,2,3);
        List<Integer> res = new No144BinaryTreePreorderTraversal().preorderTraversal2(treeNode);
        System.out.println(res.toString());
    }
}
