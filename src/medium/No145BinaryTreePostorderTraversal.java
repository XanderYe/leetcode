package medium;

import structure.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2020/9/29.
 * @see <a href="https://leetcode-cn.com/problems/binary-tree-postorder-traversal/">145. 二叉树的后序遍历</a>
 * @author 叶振东
 */
public class No145BinaryTreePostorderTraversal {
    List<Integer> ans = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
            return ans;
        }
        postorderTraversal(root.left);
        postorderTraversal(root.right);
        ans.add(root.val);
        return ans;
    }

    public static void main(String[] args) {
        TreeNode treeNode = TreeNode.create(1,null,2,3);
        List<Integer> ans = new No145BinaryTreePostorderTraversal().postorderTraversal(treeNode);
        System.out.println(ans.toString());
    }
}
