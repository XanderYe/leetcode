package medium;

import java.util.*;

/**
 * Created on 2020/8/26.
 *
 * @author 叶振东
 */
public class NoLetterCombinationsOfAPhoneNumber {

    private static List<String> ans = new ArrayList<>();

    static Map<Integer, String> map = new HashMap<>();

    static {
        map.put(2, "abc");
        map.put(3, "def");
        map.put(4, "ghi");
        map.put(5, "jkl");
        map.put(6, "mno");
        map.put(7, "pqrs");
        map.put(8, "tuv");
        map.put(9, "wxyz");
    }

    public List<String> letterCombinations(String digits) {
        ans = new ArrayList<>();
        if ("".equals(digits)) {
            return ans;
        }
        findCombinations(digits, 0, "");
        return ans;
    }

    public static void findCombinations(String digits, int index, String s) {
        if (index == digits.length()) {
            ans.add(s);
            return;
        }
        char c = digits.charAt(index);
        String letters = map.get(c - '0');
        for (int i = 0; i < letters.length(); i++) {
            findCombinations(digits, index + 1, s + letters.charAt(i));
        }
    }
    public static void main(String[] args) {
        List<String> list = new NoLetterCombinationsOfAPhoneNumber().letterCombinations("");
        list.forEach(System.out::println);
    }
}
