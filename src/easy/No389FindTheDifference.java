package easy;

/**
 * Created on 2020/12/18.
 * @see <a href="https://leetcode-cn.com/problems/find-the-difference/">389. 找不同</a>
 * @author 叶振东
 */
public class No389FindTheDifference {
    public char findTheDifference(String s, String t) {
        for (int i = 0; i < s.length(); i++) {
            t = t.replaceFirst(s.substring(i, i+1), "");
        }
        return t.charAt(0);
    }

    public char findTheDifference2(String s, String t) {
        int sum = 0;
        for (char c : t.toCharArray()) {
            sum += c;
        }
        for (char c : s.toCharArray()) {
            sum -= c;
        }
        return (char) sum;
    }

    public static void main(String[] args) {
        System.out.println(new No389FindTheDifference().findTheDifference2("abcd", "abcde"));
        System.out.println(new No389FindTheDifference().findTheDifference2("", "y"));
        System.out.println(new No389FindTheDifference().findTheDifference2("a", "aa"));
        System.out.println(new No389FindTheDifference().findTheDifference2("ae", "aea"));
    }
}
