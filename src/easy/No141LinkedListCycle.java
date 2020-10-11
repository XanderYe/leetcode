package easy;

import structure.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2020/10/9.
 * @see <a href="https://leetcode-cn.com/problems/linked-list-cycle/">141. 环形链表</a>
 * @author 叶振东
 */
public class No141LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        List<ListNode> listNodeList = new ArrayList<>();
        while (head.next != null) {
            if (!listNodeList.contains(head)) {
                listNodeList.add(head);
            } else {
                return true;
            }
            head = head.next;
        }
        return false;
    }
}
