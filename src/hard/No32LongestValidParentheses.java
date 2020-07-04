package hard;

import java.util.Stack;

public class No32LongestValidParentheses {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        boolean[] dp = new boolean[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                stack.push(i);
            } else {
                if (stack.isEmpty()) {
                    dp[i] = true;
                } else {
                    stack.pop();
                }
            }
        }
        while(!stack.empty()) {
            dp[stack.pop()] = true;
        }
        int ans = 0;
        int length = 0;
        for (boolean value : dp) {
            if (value) {
                length = 0;
                continue;
            }
            length++;
            ans = Math.max(ans, length);
        }
        return ans;
    }

    public static void main(String[] args) {
        //System.out.println(new No32LongestValidParentheses().longestValidParentheses(")()())"));
        System.out.println(new No32LongestValidParentheses().longestValidParentheses(")()())"));
    }
}
