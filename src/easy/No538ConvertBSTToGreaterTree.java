package easy;

import structure.TreeNode;

/**
 * Created on 2020/9/21.
 * @see <a href="https://leetcode-cn.com/problems/convert-bst-to-greater-tree/">538. 把二叉搜索树转换为累加树</a>
 * @author 叶振东
 */
public class No538ConvertBSTToGreaterTree {
    int sum = 0;
    public TreeNode convertBST(TreeNode root) {
        if (root == null) {
            return root;
        }
        convertBST(root.right);
        root.val = root.val + sum;
        sum = root.val;
        convertBST(root.left);
        return root;
    }
}
