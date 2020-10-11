package medium;

import structure.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * Created on 2020/10/9.
 * @see <a href="https://leetcode-cn.com/problems/linked-list-cycle-ii/">142. 环形链表 II</a>
 * @author 叶振东
 */
public class No142LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }
        Set<ListNode> listNodeList = new HashSet<>();
        while (head.next != null) {
            if (!listNodeList.contains(head)) {
                listNodeList.add(head);
            } else {
                return head;
            }
            head = head.next;
        }
        return null;
    }
}
