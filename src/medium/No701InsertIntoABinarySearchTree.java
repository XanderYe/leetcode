package medium;

import structure.TreeNode;

/**
 * Created on 2020/9/30.
 * @see <a href="https://leetcode-cn.com/problems/insert-into-a-binary-search-tree/submissions/">701. 二叉搜索树中的插入操作</a>
 * @author 叶振东
 */
public class No701InsertIntoABinarySearchTree {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        }
        if (root.val < val) {
            root.right = insertIntoBST(root.right, val);
        } else {
            root.left = insertIntoBST(root.left, val);
        }
        return root;
    }

    public static void main(String[] args) {
        TreeNode treeNode = TreeNode.create(4,2,7,1,3);
        TreeNode ans = new No701InsertIntoABinarySearchTree().insertIntoBST(treeNode, 5);
    }
}
