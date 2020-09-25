package medium;

import structure.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * Created on 2020/9/25.
 * @see <a href="https://leetcode-cn.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/">106. 从中序与后序遍历序列构造二叉树</a>
 * @author 叶振东
 */
public class No106ConstructBinaryTreeFromInorderAndPostorderTraversal {
    int postIdx;
    int[] postorder;
    int[] inorder;
    Map<Integer, Integer> idxMap = new HashMap<Integer, Integer>();

    public TreeNode helper(int iLeft, int inRight) {
        // 如果这里没有节点构造二叉树了，就结束
        if (iLeft > inRight) {
            return null;
        }

        // 选择 post_idx 位置的元素作为当前子树根节点
        int rootVal = postorder[postIdx];
        TreeNode root = new TreeNode(rootVal);

        // 根据 root 所在位置分成左右两棵子树
        int index = idxMap.get(rootVal);

        // 下标减一
        postIdx--;
        // 构造右子树
        root.right = helper(index + 1, inRight);
        // 构造左子树
        root.left = helper(iLeft, index - 1);
        return root;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        this.postorder = postorder;
        this.inorder = inorder;
        // 从后序遍历的最后一个元素开始
        postIdx = postorder.length - 1;

        // 建立（元素，下标）键值对的哈希表
        int idx = 0;
        for (Integer val : inorder) {
            idxMap.put(val, idx++);
        }

        return helper(0, inorder.length - 1);
    }
}
