package medium;

import structure.ListNode;

/**
 * Created on 2020/11/13.
 * @See <a href="https://leetcode-cn.com/problems/odd-even-linked-list/">328. 奇偶链表</a>
 * @author 叶振东
 */
public class No328OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        if (head == null){
            return head;
        }
        ListNode h1 = head;
        ListNode t2 = h1.next;
        ListNode h2 = t2;

        while(h2 != null && h2.next != null){
            h1.next = h1.next.next;
            h1 = h1.next;
            h2.next = h2.next.next;
            h2 = h2.next;
        }

        h1.next = t2;
        return head;
    }
    public ListNode oddEvenList2(ListNode head) {
        ListNode l1 = new ListNode(-1);
        ListNode dummyHead1 = l1;
        ListNode l2 = new ListNode(-1);
        ListNode dummyHead2 = l2;
        int i = 0;
        while (head != null) {
            if (i % 2 == 0) {
                l1.next = head;
                l1 = l1.next;
            } else {
                l2.next = head;
                l2 = l2.next;
            }
            head = head.next;
            i++;
        }
        l2.next = null;
        l1.next = dummyHead2.next;
        return dummyHead1.next;
    }

    public static void main(String[] args) {
        ListNode listNode = ListNode.create(1,2,3,4,5);
        ListNode ans = new No328OddEvenLinkedList().oddEvenList(listNode);
        ListNode.print(ans);
    }
}
