package medium;

import structure.ListNode;

/**
 * Created on 2020/10/13.
 * @see <a href="https://leetcode-cn.com/problems/swap-nodes-in-pairs/">24. 两两交换链表中的节点</a>
 * @author 叶振东
 */
public class No24SwapNodesInPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode listNode = dummyHead;
        while (listNode.next != null && listNode.next.next != null) {
            ListNode listNode1 = listNode.next;
            ListNode listNode2 = listNode.next.next;
            listNode1.next = listNode2.next;
            listNode2.next = listNode1;
            listNode.next = listNode2;
            listNode = listNode.next.next;
        }
        return dummyHead.next;
    }

    public ListNode swapPairs2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }

    public static void main(String[] args) {
        ListNode listNode = ListNode.create(1, 2, 3, 4);
        ListNode ans = new No24SwapNodesInPairs().swapPairs(listNode);
        System.out.print(ans.val);
        ans = ans.next;
        while (ans != null) {
            System.out.print("->" + ans.val);
            ans = ans.next;
        }
    }
}
