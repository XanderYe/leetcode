package easy;

import structure.ListNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 面试题 02.01. 移除重复节点
 * @author XanderYe
 * @date 2020/6/26
 */
public class RemoveDuplicateNodeLCCI {
    public ListNode removeDuplicateNodes(ListNode head) {
        if (head == null) {
            return head;
        }
        List<Integer> record = new ArrayList<>();
        record.add(head.val);
        ListNode prev = head;
        ListNode now = head.next;
        while (now != null) {
            int val = now.val;
            if (record.contains(val)) {
                prev.next = now.next;
            } else {
                record.add(val);
                prev = now;
            }
            now = prev.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        listNode1.next = listNode2;
        ListNode listNode3 = new ListNode(3);
        listNode2.next = listNode3;
        ListNode listNode4 = new ListNode(3);
        listNode3.next = listNode4;
        ListNode listNode5 = new ListNode(2);
        listNode4.next = listNode5;
        ListNode listNode6 = new ListNode(1);
        listNode5.next = listNode6;
        new RemoveDuplicateNodeLCCI().removeDuplicateNodes(listNode1);
        ListNode.print(listNode1);
    }
}
