package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author XanderYe
 * @see <a href="https://leetcode-cn.com/problems/valid-anagram/">242. 有效的字母异位词</a>
 * @date 2020/11/22 8:54
 */
public class No242ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            sMap.merge(s.charAt(i), 1, Integer::sum);
            tMap.merge(t.charAt(i), 1, Integer::sum);
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!sMap.get(c).equals(tMap.get(c))) {
                return false;
            }
        }
        return true;
    }

    public boolean isAnagram2(String s, String t) {
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        Arrays.sort(sc);
        Arrays.sort(tc);
        return String.valueOf(sc).equals(String.valueOf(tc));
    }

    public static void main(String[] args) {
        System.out.println(new No242ValidAnagram().isAnagram("anagram", "nagaram"));
    }
}
