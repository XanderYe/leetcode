package easy;

import java.util.Stack;

/**
 * Created by Xander on 2018-09-21.
 */
public class No20ValidParentheses {
    public static void main(String[] args) {
        String s="(][)";
        System.out.println(isValid(s));
    }
    public static boolean isValid(String s) {
        if (s.isEmpty()) {
            return true;
        }
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
