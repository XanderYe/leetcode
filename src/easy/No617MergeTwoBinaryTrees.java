package easy;

import structure.TreeNode;

/**
 * Created on 2020/9/23.
 * @see <a href="https://leetcode-cn.com/problems/merge-two-binary-trees/">617. 合并二叉树</a>
 * @author 叶振东
 */
public class No617MergeTwoBinaryTrees {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
        t1.val = t1.val + t2.val;
        dfs(t1, t2);
        return t1;
    }

    public void dfs(TreeNode t1, TreeNode t2) {
        TreeNode left1 = t1.left;
        TreeNode right1 = t1.right;
        TreeNode left2 = t2.left;
        TreeNode right2 = t2.right;
        if (left1 != null && left2 != null) {
            left1.val = left1.val + left2.val;
            dfs(left1, left2);
        } else if (left1 == null && left2 != null) {
            t1.left = left2;
        }
        if (right1 != null && right2 != null) {
            right1.val = right1.val + right2.val;
            dfs(right1, right2);
        } else if (right1 == null && right2 != null) {
            t1.right = right2;
        }
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t1left = new TreeNode(3);
        t1left.left = new TreeNode(5);
        t1.left = t1left;
        t1.right = new TreeNode(2);

        TreeNode t2 = new TreeNode(2);
        TreeNode t2left = new TreeNode(1);
        t2left.right = new TreeNode(4);
        t2.left = t2left;
        TreeNode t2right = new TreeNode(3);
        t2right.right = new TreeNode(7);
        t2.left = t2left;
        t2.right = t2right;
        new No617MergeTwoBinaryTrees().mergeTrees(t1, t2);
    }
}
