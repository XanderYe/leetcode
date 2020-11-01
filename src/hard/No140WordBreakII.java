package hard;

import java.util.*;

/**
 * @author XanderYe
 * @see <a href="https://leetcode-cn.com/problems/word-break-ii/">140. 单词拆分 II</a>
 * @date 2020/11/1 8:43
 */
public class No140WordBreakII {

    List<String> ans = new ArrayList<>();
    public List<String> wordBreak(String s, List<String> wordDict) {
        Set<String> wordSet = new HashSet<>(wordDict);
        int len = s.length();

        boolean[] dp = new boolean[len + 1];
        dp[0] = true;

        for (int right = 1; right <= len; right++) {
            for (int left = right - 1; left >= 0; left--) {
                if (wordSet.contains(s.substring(left, right)) && dp[left]) {
                    dp[right] = true;
                    break;
                }
            }
        }

        if (dp[len]) {
            Deque<String> path = new ArrayDeque<>();
            dfs(s, len, wordSet, dp, path);
        }
        return ans;
    }

    private void dfs(String s, int len, Set<String> wordSet, boolean[] dp, Deque<String> path) {
        if (len == 0) {
            ans.add(String.join(" ",path));
            return;
        }

        for (int i = len - 1; i >= 0; i--) {
            String suffix = s.substring(i, len);
            if (wordSet.contains(suffix) && dp[i]) {
                path.addFirst(suffix);
                dfs(s, i, wordSet, dp, path);
                path.removeFirst();
            }
        }
    }

    public static void main(String[] args) {
        //String s = "catsanddog";
        //List<String> list = Arrays.asList("cat", "cats", "and", "sand", "dog");
        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        List<String> list = Arrays.asList("a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa");
        //String s = "pineapplepenapple";
        //List<String> list = Arrays.asList("apple", "pen", "applepen", "pine", "pineapple");
        long t1 = System.currentTimeMillis();
        List<String> ans = new No140WordBreakII().wordBreak(s, list);
        long t2 = System.currentTimeMillis();
        System.out.println(ans.toString());
        System.out.println(t2 - t1);
    }
}
