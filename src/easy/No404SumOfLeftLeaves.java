package easy;

import structure.TreeNode;

/**
 * Created on 2020/9/19.
 * @see <a href="https://leetcode-cn.com/problems/sum-of-left-leaves/solution/zuo-xie-zi-zhi-he-by-leetcode-solution/">404. 左叶子之和</a>
 * @author 叶振东
 */
public class No404SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        TreeNode left = root.left;
        TreeNode right = root.right;
        int sum = 0;
        if (left != null) {
            sum += left.left == null && left.right == null ? left.val : sumOfLeftLeaves(left);
        }
        sum += sumOfLeftLeaves(right);
        return sum;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        TreeNode right = new TreeNode(20);
        right.left = new TreeNode(15);
        right.right = new TreeNode(7);
        treeNode.right = right;
        System.out.println(new No404SumOfLeftLeaves().sumOfLeftLeaves(treeNode));
    }
}
