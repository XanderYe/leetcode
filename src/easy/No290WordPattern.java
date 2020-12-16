package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created on 2020/12/16.
 * @see <a href="https://leetcode-cn.com/problems/word-pattern/">290. 单词规律</a>
 * @author 叶振东
 */
public class No290WordPattern {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        char[] chars = pattern.toCharArray();
        if (words.length != chars.length) {
            return false;
        }
        Map<Character, String> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            String wd = map.get(chars[i]);
            if (wd == null) {
                if (map.containsValue(words[i])) {
                    return false;
                }
                map.put(chars[i], words[i]);
            } else {
                if (!wd.equals(words[i])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new No290WordPattern().wordPattern("abba", "dog cat cat dog"));
        System.out.println(new No290WordPattern().wordPattern("abba", "dog cat cat fish"));
        System.out.println(new No290WordPattern().wordPattern("aaaa", "dog cat cat dog"));
        System.out.println(new No290WordPattern().wordPattern("abba", "dog dog dog dog"));
    }
}
