package medium;

import structure.Node;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created on 2020/10/15.
 * @see <a href="https://leetcode-cn.com/problems/populating-next-right-pointers-in-each-node/submissions/">116. 填充每个节点的下一个右侧节点指针</a>
 * @author 叶振东
 */
public class No116PopulatingNextRightPointersInEachNode {
    public Node connect(Node root) {
        if (root == null) {
            return root;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                if (i < size - 1) {
                    node.next = queue.peek();
                }
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }
        return root;
    }
}
