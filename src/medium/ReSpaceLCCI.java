package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 面试题 17.13. 恢复空格
 * Created on 2020/7/9.
 *
 * @author 叶振东
 */
public class ReSpaceLCCI {
    public int respace(String[] dictionary, String sentence) {
        int[] dp = new int[sentence.length() + 1];
        dp[0] = 0;
        for (int i = 1; i <= sentence.length(); i++) {
            dp[i] = dp[i - 1] + 1;
            for (int j = 0; j < dictionary.length; j++) {
                int length = dictionary[j].length();
                if (length <= i) {
                    if (sentence.substring(i - length, i).equals(dictionary[j])) {
                        dp[i] = Math.min(dp[i], dp[i - length]);
                    }
                }
            }
        }
        return dp[sentence.length()];
    }

    public static void main(String[] args) {
        String[] dictionary  = new String[]{"looked","just","like","her","brother"};
        String sentence = "jesslookedjustliketimherbrother";
        //String[] dictionary = new String[]{"vprkj", "sqvuzjz", "ptkrqrkussszzprkqrjrtzzvrkrrrskkrrursqdqpp", "spqzqtrqs", "rkktkruzsjkrzqq", "rk", "k", "zkvdzqrzpkrukdqrqjzkrqrzzkkrr", "pzpstvqzrzprqkkkd", "jvutvjtktqvvdkzujkq", "r", "pspkr", "tdkkktdsrkzpzpuzvszzzzdjj", "zk", "pqkjkzpvdpktzskdkvzjkkj", "sr", "zqjkzksvkvvrsjrjkkjkztrpuzrqrqvvpkutqkrrqpzu"};
        //String sentence = "rkktkruzsjkrzqqzkvdzqrzpkrukdqrqjzkrqrzzkkrr";
        System.out.println(new ReSpaceLCCI().respace(dictionary, sentence));
    }
}
