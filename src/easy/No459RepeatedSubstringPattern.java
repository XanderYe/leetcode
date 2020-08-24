package easy;

/**
 * Created on 2020/8/24.
 *
 * @author 叶振东
 */
public class No459RepeatedSubstringPattern {
    public boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        for (int i = 1; i <= len / 2; i++) {
            if (len % i == 0) {
                String s1 = s.substring(0, i);
                if (s.replace(s1, "").length() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new No459RepeatedSubstringPattern().repeatedSubstringPattern("a"));
    }
}
