package easy;

import structure.ListNode;

/**
 * Created by YE on 2018-10-15.
 */
public class No21MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(0);
        ListNode firstNode = listNode;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                listNode.next = l1;
                l1 = l1.next;
            } else {
                listNode.next = l2;
                l2 = l2.next;
            }
            listNode = listNode.next;
        }
        while (l1 != null) {
            listNode.next = l1;
            l1 = l1.next;
            listNode = listNode.next;
        }
        while (l2 != null) {
            listNode.next = l2;
            l2 = l2.next;
            listNode = listNode.next;
        }
        return firstNode.next;
    }
}
