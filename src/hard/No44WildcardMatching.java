package hard;

public class No44WildcardMatching {
    public boolean isMatch(String s, String p) {
        int l1 = s.length();
        int l2 = p.length();
        boolean[][] dp = new boolean[l1 + 1][l2 + 1];
        dp[0][0] = true;
        for (int j = 1; j <= p.length(); j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 1];
            }
        }
        for (int i = 1; i <= s.length(); i++) {
              for (int j = 1; j <= p.length(); j++) {
                if (p.charAt(j - 1) == '?' || s.charAt(i - 1) == p.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else if (p.charAt(j - 1) == '*' && (dp[i - 1][j] || dp[i][j - 1])) {
                    dp[i][j] = true;
                }
            }
        }
        return dp[l1][l2];
    }

    public static void main(String[] args) {
        System.out.println(new No44WildcardMatching().isMatch("aaasdasd", "aa*asd"));
    }
}
