package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Xander on 2018-09-18.
 */
public class No13RomanToInteger {
    public int romanToInt(String s) {
        int result = 0;
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        for (int i = 0; i < s.length(); i++) {
            result += romanMap.get(s.charAt(i));
        }
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == 'I' && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X' || s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C' || s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {
                result -= romanMap.get('I') * 2;
            } else if (s.charAt(i) == 'V' && (s.charAt(i + 1) == 'X' || s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C' || s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {
                result -= romanMap.get('V') * 2;
            } else if (s.charAt(i) == 'X' && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C' || s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {
                result -= romanMap.get('X') * 2;
            } else if (s.charAt(i) == 'L' && (s.charAt(i + 1) == 'C' || s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {
                System.out.println(result);
                result -= romanMap.get('L') * 2;
            } else if (s.charAt(i) == 'C' && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M')) {
                result -= romanMap.get('C') * 2;
            } else if (s.charAt(i) == 'D' && s.charAt(i + 1) == 'M') {
                result -= romanMap.get('D') * 2;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        No13RomanToInteger no13RomanToInteger = new No13RomanToInteger();
        System.out.println(no13RomanToInteger.romanToInt("MCDLXXVI"));
    }
}
