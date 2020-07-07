package medium;

import structure.TreeNode;

import java.util.*;

/**
 * Created on 2020/7/7.
 *
 * @author 叶振东
 */
public class No112PathSumII {
    LinkedList<Integer> linkedList = new LinkedList<>();
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        dfs(root, 0, sum);
        return list;
    }

    public void dfs(TreeNode treeNode, int total, int sum) {
        if (treeNode == null) {
            return;
        }
        total += treeNode.val;
        linkedList.add(treeNode.val);
        if (treeNode.left == null && treeNode.right == null) {
            if (total == sum) {
                List<Integer> l2 = new ArrayList<>(linkedList);
                list.add(l2);
            }
            linkedList.removeLast();
            return;
        }
        dfs(treeNode.left, total, sum);
        dfs(treeNode.right, total, sum);
        linkedList.removeLast();
    }

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(7);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(11);
        t3.left = t1;
        t3.right = t2;
        TreeNode t4 = new TreeNode(4);
        t4.left = t3;

        TreeNode t5 = new TreeNode(1);
        TreeNode t6 = new TreeNode(4);
        t6.left = new TreeNode(5);
        t6.right = t5;
        TreeNode t7 = new TreeNode(8);
        t7.left = new TreeNode(13);
        t7.right = t6;
        TreeNode t9 = new TreeNode(5);
        t9.left = t4;
        t9.right = t7;
        List<List<Integer>> list = new No112PathSumII().pathSum(t9, 22);
        for (List<Integer> l2 : list) {
            System.out.println(l2.toString());
        }
    }
}
