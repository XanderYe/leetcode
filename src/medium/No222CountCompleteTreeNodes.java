package medium;

import structure.TreeNode;

import java.util.LinkedList;

/**
 * Created on 2020/11/24.
 * @see <a href="https://leetcode-cn.com/problems/count-complete-tree-nodes/">222. 完全二叉树的节点个数</a>
 * @author 叶振东
 */
public class No222CountCompleteTreeNodes {
    public int countNodes(TreeNode root) {
        LinkedList<TreeNode> linkedList = new LinkedList<>();
        int ans = 0;
        if (root != null) {
            linkedList.offer(root);
            while (!linkedList.isEmpty()) {
                int len = linkedList.size();
                for (int i = 0; i < len; i++) {
                    TreeNode treeNode = linkedList.poll();
                    ans++;
                    if (treeNode.left != null) {
                        linkedList.offer(treeNode.left);
                    }
                    if (treeNode.right != null) {
                        linkedList.offer(treeNode.right);
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        TreeNode treeNode = TreeNode.create(1,2,3,4,5,6);
        System.out.println(new No222CountCompleteTreeNodes().countNodes(treeNode));
    }
}
