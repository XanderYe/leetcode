package medium;

import structure.ListNode;

/**
 * Created on 2020/11/20.
 * @see <a href="https://leetcode-cn.com/problems/insertion-sort-list/">147. 对链表进行插入排序</a>
 * @author 叶振东
 */
public class No147InsertSortList {
    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode dummyHead = new ListNode();
        while (head != null) {
            ListNode next = head.next;
            ListNode tmp = dummyHead.next;
            ListNode tmpLast = dummyHead;
            while (tmp != null) {
                if (head.val <= tmp.val) {
                    break;
                } else {
                    tmpLast = tmp;
                    tmp = tmp.next;
                }
            }
            tmpLast.next = head;
            head.next = tmp;
            head = next;
        }
        return dummyHead.next;
    }

    public ListNode insertionSortList2(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        ListNode newHead = new ListNode();
        ListNode node = head;
        while(node != null){
            ListNode next = node.next;
            ListNode prevNode = newHead;
            ListNode sortNode = newHead.next;
            while(sortNode != null){
                if(node.val > sortNode.val){
                    prevNode = sortNode;
                    sortNode = sortNode.next;
                }else{
                    break;
                }
            }
            prevNode.next = node;
            node.next = sortNode;

            node = next;
        }
        return newHead.next;
    }

    public static void main(String[] args) {
        ListNode listNode = ListNode.create(4,2,1,3);
        ListNode ans = new No147InsertSortList().insertionSortList(listNode);
        ListNode.print(ans);
    }
}
