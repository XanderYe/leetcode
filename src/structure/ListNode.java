package structure;

/**
 * Created by YE on 2018-10-15.
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        this.val = x;
    }

    public static void print(ListNode listNode) {
        StringBuilder stringBuilder = new StringBuilder();
        if (listNode != null) {
            while (listNode != null) {
                stringBuilder.append(listNode.val).append(",");
                listNode = listNode.next;
            }
            if (stringBuilder.length() > 0) {
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            }
            System.out.println(stringBuilder.toString());
        } else {
            System.out.println("null");
        }
    }

    public static ListNode create(Integer...nums) {
        ListNode listNode = null;
        ListNode head = null;
        for (Integer num : nums) {
            if (listNode == null) {
                listNode = new ListNode(num);
                head = listNode;
            } else {
                listNode.next = new ListNode(num);
                listNode = listNode.next;
            }
        }
        return head;
    }
}
