package medium;

import structure.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author XanderYe
 * @see <a href="https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/">19. 删除链表的倒数第N个节点</a>
 * @date 2020/10/18 12:42
 */
public class No19RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ans = head;
        List<ListNode> listNodeList = new ArrayList<>();
        while (ans != null) {
            listNodeList.add(ans);
            ans = ans.next;
        }
        if (listNodeList.size() == n) {
            return head.next;
        }
        if (n == 1) {
            listNodeList.get(listNodeList.size() - n - 1).next = null;
        } else {
            ListNode prev = listNodeList.get(listNodeList.size() - n - 1);
            ListNode next = listNodeList.get(listNodeList.size() - n + 1);
            prev.next = next;
        }
        return head;
    }

    /**
     * 快慢指针
     * @param head
     * @param n
     * @return structure.ListNode
     * @author XanderYe
     * @date 2020/10/18
     */
    public ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode first = head;
        ListNode second = dummy;
        for (int i = 0; i < n; ++i) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        ListNode ans = dummy.next;
        return ans;
    }

    public static void main(String[] args) {
        ListNode listNode = ListNode.create(1,2,3,4,5);
        ListNode ans = new No19RemoveNthNodeFromEndOfList().removeNthFromEnd(listNode, 5);
        ListNode.print(ans);
    }
}
