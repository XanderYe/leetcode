package medium;

import structure.TreeNode;

import java.util.*;

/**
 * Created on 2020/12/22.
 * @see <a href="https://leetcode-cn.com/problems/binary-tree-zigzag-level-order-traversal/">103. 二叉树的锯齿形层序遍历</a>
 * @author 叶振东
 */
public class No103BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        Deque<TreeNode> deque = new LinkedList<>();
        boolean asc = true;
        deque.offer(root);
        while (!deque.isEmpty()) {
            int len = deque.size();
            List<Integer> childList = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                TreeNode treeNode = deque.pollFirst();
                childList.add(treeNode.val);
                if (treeNode.left != null) {
                    deque.addLast(treeNode.left);
                }
                if (treeNode.right != null) {
                    deque.addLast(treeNode.right);
                }
            }
            if (!asc) {
                Collections.reverse(childList);
            }
            asc = !asc;
            ans.add(childList);
        }
        return ans;
    }

    public static void main(String[] args) {
        TreeNode treeNode = TreeNode.create(3,9,20,null,null,15,7);
        List<List<Integer>> ans = new No103BinaryTreeZigzagLevelOrderTraversal().zigzagLevelOrder(treeNode);
        for (List<Integer> child : ans) {
            System.out.println(child.toString());
        }
    }
}
