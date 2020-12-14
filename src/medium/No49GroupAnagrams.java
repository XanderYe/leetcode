package medium;

import java.util.*;

/**
 * Created on 2020/12/14.
 * @see <a href="https://leetcode-cn.com/problems/group-anagrams/">49. 字母异位词分组</a>
 * @author 叶振东
 */
public class No49GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String ns = String.valueOf(chars);
            List<String> stringList = map.getOrDefault(ns, new ArrayList<>());
            stringList.add(s);
            map.put(ns, stringList);
        }
        List<List<String>> ans = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            ans.add(entry.getValue());
        }
        return ans;
    }

    public static void main(String[] args) {
        List<List<String>> ans = new No49GroupAnagrams().groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        for (List<String> an : ans) {
            System.out.println(an.toString());
        }
    }
}
