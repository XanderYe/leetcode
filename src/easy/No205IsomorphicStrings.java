package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author XanderYe
 * @see <a href="https://leetcode-cn.com/problems/isomorphic-strings/">205. 同构字符串</a>
 * @date 2020/12/28 9:45
 */
public class No205IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        for (int i = 0; i < sc.length; i++) {
            if (!map.values().contains(tc[i]) && map.get(sc[i]) == null) {
                map.put(sc[i], tc[i]);
            }
        }
        for (int i = 0; i < sc.length; i++) {
            Character newc = map.get(sc[i]);
            if (null != newc) {
                sc[i] = newc;
            }
        }
        return String.valueOf(sc).equals(t);
    }

    public static void main(String[] args) {
        System.out.println(new No205IsomorphicStrings().isIsomorphic("ab", "aa"));
        System.out.println(new No205IsomorphicStrings().isIsomorphic("egg", "add"));
        System.out.println(new No205IsomorphicStrings().isIsomorphic("foo", "bar"));
        System.out.println(new No205IsomorphicStrings().isIsomorphic("paper", "title"));
    }
}
