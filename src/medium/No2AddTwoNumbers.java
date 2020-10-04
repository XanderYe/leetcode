package medium;

import structure.ListNode;

/**
 * Created on 2020/10/4.
 * @see <a href="https://leetcode-cn.com/problems/add-two-numbers/submissions/">2. 两数相加</a>
 * @author 叶振东
 */
public class No2AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode tail = null;
        ListNode head = null;
        int tmp = 0;
        while (l1 != null || l2 != null || tmp != 0) {
            int sum = tmp;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            tmp = sum / 10;
            int val = sum % 10;
            if (tail == null) {
                tail = new ListNode(val);
                head = tail;
            } else {
                tail.next = new ListNode(val);
                tail = tail.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode listNode = new No2AddTwoNumbers().addTwoNumbers(l1, l2);
    }
}
