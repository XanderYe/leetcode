package easy;

/**
 * Created on 2020/8/10.
 *
 * @author 叶振东
 */
public class No696CountBinarySubstrings {
    public int countBinarySubstrings(String s) {
        int ptr = 0, n = s.length(), last = 0, ans = 0;
        while (ptr < n) {
            char c = s.charAt(ptr);
            int count = 0;
            while (ptr < n && s.charAt(ptr) == c) {
                ++ptr;
                ++count;
            }
            ans += Math.min(count, last);
            last = count;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new No696CountBinarySubstrings().countBinarySubstrings("00110011"));
    }
}
