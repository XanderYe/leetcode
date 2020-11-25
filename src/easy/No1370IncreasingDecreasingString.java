package easy;

import java.util.Arrays;

/**
 * Created on 2020/11/25.
 * @see <a href="https://leetcode-cn.com/problems/increasing-decreasing-string/">1370. 上升下降字符串</a>
 * @author XanderYe
 */
public class No1370IncreasingDecreasingString {
    public String sortString(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        int len = s.length();
        boolean[] used = new boolean[len];
        StringBuilder sb = new StringBuilder();
        while (sb.length() < len) {
            boolean first = true;
            for (int i = 0; i < chars.length; i++) {
                if (used[i]) {
                    continue;
                }
                if (first || chars[i] > sb.charAt(sb.length() - 1)) {
                    sb.append(chars[i]);
                    used[i] = true;
                    first = false;
                }
            }
            first = true;
            for (int i = chars.length - 1; i >= 0; i--) {
                if (used[i]) {
                    continue;
                }
                if (first || chars[i] < sb.charAt(sb.length() - 1)) {
                    sb.append(chars[i]);
                    used[i] = true;
                    first = false;
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new No1370IncreasingDecreasingString().sortString("aaaabbbbcccc") + " = abccbaabccba");
        System.out.println(new No1370IncreasingDecreasingString().sortString("leetcode") + " = cdelotee");
    }
}
