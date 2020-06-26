package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @author XanderYe
 * @date 2020/6/25
 */
public class No139WorkBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        if (wordDict == null) {
            return s == null;
        }
        int l = s.length();
        boolean[] dp = new boolean[l + 1];
        dp[0] = true;
        for (int i = 1; i <= l; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (dp[j] && wordDict.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[l];
    }

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("leet");
        stringList.add("code");
        System.out.println(new No139WorkBreak().wordBreak("leetcode", stringList));
    }
}
