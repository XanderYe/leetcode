package medium;

/**
 * Created on 2020/8/19.
 *
 * @author 叶振东
 */
public class No647PalindromicSubstrings {
    public int countSubstrings(String s) {
        int len = s.length();
        int ans = 0;
        boolean[][] dp = new boolean[len][len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j <= i; j++) {
                if (s.charAt(i) == s.charAt(j) && (i - j < 2 || dp[j + 1][i - 1])) {
                    dp[j][i] = true;
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new No647PalindromicSubstrings().countSubstrings("aaa"));
    }
}
