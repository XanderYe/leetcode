package easy;

import structure.TreeNode;

/**
 * Created on 2020/10/12.
 * @see <a href="https://leetcode-cn.com/problems/minimum-absolute-difference-in-bst/">530. 二叉搜索树的最小绝对差</a>
 * @author 叶振东
 */
public class No530MinimumAbsoluteDifferenceInBST {
    int pre;
    int ans;
    public int getMinimumDifference(TreeNode root) {
        ans = Integer.MAX_VALUE;
        pre = -1;
        dfs(root);
        return ans;
    }

    public void dfs(TreeNode root) {
        if (root == null) {
            return;
        }
        dfs(root.left);
        if (pre != -1) {
            ans = Math.min(ans, root.val - pre);
        }
        pre = root.val;
        dfs(root.right);
    }

    public static void main(String[] args) {
        TreeNode treeNode = TreeNode.create(5,4,7);
        System.out.println(new No530MinimumAbsoluteDifferenceInBST().getMinimumDifference(treeNode));
        treeNode = TreeNode.create(236,104,701,null,227,null,911);
        System.out.println(new No530MinimumAbsoluteDifferenceInBST().getMinimumDifference(treeNode));
    }
}
