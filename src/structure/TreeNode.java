package structure;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created on 2020/7/3.
 *
 * @author 叶振东
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    public  TreeNode() {

    }

    public TreeNode(Integer[] nums) {
        if (nums.length > 0) {
            int index = 0;
            Deque<TreeNode> deque = new ArrayDeque<>();
            this.val = nums[index++];
            deque.add(this);
            while (!deque.isEmpty()) {
                TreeNode treeNode = deque.pop();
                if (index == nums.length) {
                    break;
                }
                Integer num = nums[index++];
                if (num != null) {
                    TreeNode tLeft = new TreeNode(num);
                    treeNode.left = tLeft;
                    deque.add(tLeft);
                } else {
                    treeNode.left = null;
                }

                if (index == nums.length) {
                    break;
                }
                num = nums[index++];
                if (num != null) {
                    TreeNode tRight = new TreeNode(num);
                    treeNode.right = tRight;
                    deque.add(tRight);
                } else {
                    treeNode.right = null;
                }
            }
        }
    }
}
