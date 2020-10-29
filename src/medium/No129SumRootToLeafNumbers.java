package medium;

import structure.TreeNode;

/**
 * Created on 2020/10/29.
 * @see <a href="https://leetcode-cn.com/problems/sum-root-to-leaf-numbers/">129. 求根到叶子节点数字之和</a>
 * @author 叶振东
 */
public class No129SumRootToLeafNumbers {
    public int sumNumbers(TreeNode root) {
        return sumNumbers(root, 0);
    }

    public int sumNumbers(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        sum = sum * 10 + root.val;
        if (root.left == null && root.right == null) {
            return sum;
        } else {
            return sumNumbers(root.left, sum) + sumNumbers(root.right, sum);
        }
    }

    public static void main(String[] args) {
        TreeNode treeNode = TreeNode.create(4,9,0,5,1);
        System.out.println(new No129SumRootToLeafNumbers().sumNumbers(treeNode));
    }
}
