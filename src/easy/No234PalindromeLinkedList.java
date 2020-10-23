package easy;

import structure.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2020/10/23.
 * @see <a href="https://leetcode-cn.com/problems/palindrome-linked-list/">234. 回文链表</a>
 * @author 叶振东
 */
public class No234PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        ListNode listNode = head;
        List<Integer> list = new ArrayList<>();
        while (listNode != null) {
            list.add(listNode.val);
            listNode = listNode.next;
        }
        int len = list.size();
        for (int i = 0; i < len / 2; i++) {
            if (!list.get(i).equals(list.get(len - i - 1))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode listNode = ListNode.create(1,2,2,1);
        System.out.println(new No234PalindromeLinkedList().isPalindrome(listNode));
    }
}
