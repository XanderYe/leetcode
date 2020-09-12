package easy;

import structure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created on 2020/9/12.
 * @see <a href="https://leetcode-cn.com/problems/average-of-levels-in-binary-tree/">637. 二叉树的层平均值</a>
 * @author 叶振东
 */
public class No637AverageOfLevelsInBinaryTree {
    List<Double> ans;
    public List<Double> averageOfLevels(TreeNode root) {
        ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            double sum = 0;
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                TreeNode treeNode = queue.poll();
                sum += treeNode.val;
                if (treeNode.left != null) {
                    queue.offer(treeNode.left);
                }
                if (treeNode.right != null) {
                    queue.offer(treeNode.right);
                }
            }
            ans.add(sum / len);
        }
        return ans;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        TreeNode treeNode1 = new TreeNode(20);
        treeNode1.left = new TreeNode(15);
        treeNode1.right = new TreeNode(7);
        treeNode.right = treeNode1;
        List<Double> ans = new No637AverageOfLevelsInBinaryTree().averageOfLevels(treeNode);
        System.out.println(ans.toString());
    }
}
