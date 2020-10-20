package medium;

import structure.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2020/10/20.
 * @see <a href="https://leetcode-cn.com/problems/reorder-list/solution/zhong-pai-lian-biao-by-leetcode-solution/">143. 重排链表</a>
 * @author 叶振东
 */
public class No143ReorderList {
    public void reorderList(ListNode head) {
        List<ListNode> listNodeList = new ArrayList<>();
        ListNode listNode = head;
        while (listNode != null) {
            listNodeList.add(listNode);
            listNode = listNode.next;
        }
        int i = 0, j = listNodeList.size() - 1;
        while (i < j) {
            listNodeList.get(i).next = listNodeList.get(j);
            i++;
            if (i == j) {
                break;
            }
            listNodeList.get(j).next = listNodeList.get(i);
            j--;
        }
        listNodeList.get(i).next = null;
    }

    public static void main(String[] args) {
        ListNode listNode = ListNode.create(1,2,3,4,5);
        new No143ReorderList().reorderList(listNode);
        ListNode.print(listNode);
    }
}
