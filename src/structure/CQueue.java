package structure;

import java.util.LinkedList;
import java.util.Stack;

/**
 * Created on 2020/6/30.
 *
 * @author 叶振东
 */
public class CQueue {

    private LinkedList<Integer> stack1;
    private LinkedList<Integer> stack2;

    public CQueue() {
        stack1 = new LinkedList<>();
        stack2 = new LinkedList<>();
    }

    public void appendTail(int value) {
        stack1.add(value);
    }

    public int deleteHead() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                return -1;
            } else {
                while(!stack1.isEmpty()) {
                    stack2.add(stack1.pop());
                }
                return stack2.pop();
            }
        } else {
            return stack2.pop();
        }
    }

    public static void main(String[] args) {
        CQueue cQueue = new CQueue();
        cQueue.appendTail(3);
        System.out.println(cQueue.deleteHead());
        System.out.println(cQueue.deleteHead());
    }
}
