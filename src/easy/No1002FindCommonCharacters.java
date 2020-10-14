package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2020/10/14.
 * @see <a href="https://leetcode-cn.com/problems/find-common-characters/comments/">1002. 查找常用字符</a>
 * @author 叶振东
 */
public class No1002FindCommonCharacters {
    public List<String> commonChars(String[] A) {
        String s0 = A[0];
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < s0.length(); i++) {
            int match = 0;
            for (int j = 1; j < A.length; j++) {
                if (A[j].indexOf(s0.charAt(i)) > -1) {
                    match++;
                }
            }
            if (match == A.length - 1) {
                String ch = String.valueOf(s0.charAt(i));
                for (int j = 1; j < A.length; j++) {
                    A[j] = A[j].replaceFirst(ch, "");
                }
                ans.add(ch);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] A = new String[]{"bella","label","roller"};
        List<String> ans = new No1002FindCommonCharacters().commonChars(A);
        System.out.println(ans.toString());
    }
}
