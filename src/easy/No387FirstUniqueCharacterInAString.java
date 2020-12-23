package easy;

import java.util.*;

/**
 * @author XanderYe
 * @see <a href="https://leetcode-cn.com/problems/first-unique-character-in-a-string/">387. 字符串中的第一个唯一字符</a>
 * @date 2020/12/23 19:22
 */
public class No387FirstUniqueCharacterInAString {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>(26);
        char[] chars = s.toCharArray();
        for (char ch : chars) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < chars.length; i++) {
            if (map.get(chars[i]) == 1) {
                return i;
            }
        }
        return -1;
    }
    public int firstUniqChar2(String s) {
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            boolean exist = false;
            for (int j = 0; j < chars.length; j++) {
                if (chars[i] == chars[j] && i != j) {
                    exist = true;
                    break;
                }
            }
            if (!exist) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        //System.out.println(new No387FirstUniqueCharacterInAString().firstUniqChar("cc"));
        //System.out.println(new No387FirstUniqueCharacterInAString().firstUniqChar("cca"));
        //System.out.println(new No387FirstUniqueCharacterInAString().firstUniqChar("leetcode"));
        //System.out.println(new No387FirstUniqueCharacterInAString().firstUniqChar("loveleetcode"));
        System.out.println(new No387FirstUniqueCharacterInAString().firstUniqChar("aadadaad"));
        //System.out.println(new No387FirstUniqueCharacterInAString().firstUniqChar2("cc"));
        //System.out.println(new No387FirstUniqueCharacterInAString().firstUniqChar2("cca"));
        //System.out.println(new No387FirstUniqueCharacterInAString().firstUniqChar2("leetcode"));
        //System.out.println(new No387FirstUniqueCharacterInAString().firstUniqChar2("loveleetcode"));
        System.out.println(new No387FirstUniqueCharacterInAString().firstUniqChar2("aadadaad"));
    }
}
