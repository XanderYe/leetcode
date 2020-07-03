package easy.No108;


import structure.TreeNode;

/**
 * Created on 2020/7/3.
 *
 * @author 叶振东
 */
public class ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    public TreeNode helper(int[] nums, int l, int r) {
        int mid = (l + r) / 2;
        if (r < l) {
            return null;
        }
        TreeNode treeNode = new TreeNode(nums[mid]);
        treeNode.left = helper(nums, l, mid - 1);
        treeNode.right = helper(nums, mid + 1, r);
        return treeNode;
    }
}
