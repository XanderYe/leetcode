package easy;

import structure.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author XanderYe
 * @see <a href="https://leetcode-cn.com/problems/binary-tree-level-order-traversal-ii/solution/>107. 二叉树的层次遍历 II</a>
 * @date 2020/9/6 12:17
 */
public class No107BinaryTreeLevelOrderTraversalII {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        LinkedList<List<Integer>> ans = new LinkedList<>();
        if (root == null) {
            return ans;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                TreeNode treeNode = queue.poll();
                list.add(treeNode.val);
                if (treeNode.left != null) {
                    queue.add(treeNode.left);
                }
                if (treeNode.right != null) {
                    queue.add(treeNode.right);
                }
            }
            ans.addFirst(list);
        }
        return ans;
    }


    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        TreeNode t1 = new TreeNode(20);
        t1.left = new TreeNode(15);
        t1.right = new TreeNode(7);
        treeNode.right = t1;
        List<List<Integer>> ans = new No107BinaryTreeLevelOrderTraversalII().levelOrderBottom(treeNode);
        for (List<Integer> list : ans) {
            System.out.println(list.toString());
        }
    }
}
