package easy;

import structure.TreeNode;

/**
 * Created on 2020/9/27.
 * @see <a href="https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-search-tree/">235. 二叉搜索树的最近公共祖先</a>
 * @author 叶振东
 */
public class No235LowestCommonAncestorOfABinarySearchTree {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if ((root.val - p.val) * (root.val - q.val) <= 0) {
            return root;
        } else if (root.val < p.val && root.val < q.val) {
            return lowestCommonAncestor(root.right, p, q);
        } else {
            return lowestCommonAncestor(root.left, p, q);
        }
    }

    public static void main(String[] args) {
        TreeNode treeNode = TreeNode.create(6,2,8,0,4,7,9,null,null,3,5);
        TreeNode p = new TreeNode(2);
        TreeNode q = new TreeNode(4);
        TreeNode res = new No235LowestCommonAncestorOfABinarySearchTree().lowestCommonAncestor(treeNode, p, q);
        System.out.println(res.val);
    }
}
