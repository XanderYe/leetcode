package easy;

/**
 * Created on 2020/10/19.
 * @see <a href="https://leetcode-cn.com/problems/backspace-string-compare/submissions/">844. 比较含退格的字符串</a>
 * @author 叶振东
 */
public class No844BackspaceStringCompare {
    public boolean backspaceCompare(String S, String T) {
        int m = S.length();
        int n = T.length();
        int i = 0, j =0;
        StringBuilder s = new StringBuilder();
        StringBuilder t = new StringBuilder();
        while (i < m || j < n) {
            if (i < m) {
                if (S.charAt(i) == '#') {
                    if (s.length() > 0) {
                        s.deleteCharAt(s.length() - 1);
                    }
                } else {
                    s.append(S.charAt(i));
                }
                i++;
            }
            if (j < n) {
                if (T.charAt(j) == '#') {
                    if (t.length() > 0) {
                        t.deleteCharAt(t.length() - 1);
                    }
                } else {
                    t.append(T.charAt(j));
                }
                j++;
            }
        }
        return s.toString().equals(t.toString());
    }

    public static void main(String[] args) {
        String S = "ab#c";
        String T = "ad#c";
        System.out.println(new No844BackspaceStringCompare().backspaceCompare(S, T));
    }
}
