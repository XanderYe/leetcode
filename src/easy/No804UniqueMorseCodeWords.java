package easy;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Xander on 2018-10-12.
 */
public class No804UniqueMorseCodeWords {
    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println(new No804UniqueMorseCodeWords().uniqueMorseRepresentations(words));
    }

    public int uniqueMorseRepresentations(String[] words) {
        String[] encode = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Set<String> set = new HashSet();
        for (String word : words) {
            StringBuffer stringBuffer = new StringBuffer();
            for (char c : word.toCharArray()) {
                stringBuffer.append(encode[c - 'a']);
            }
            set.add(stringBuffer.toString());
        }
        return set.size();
    }
}
