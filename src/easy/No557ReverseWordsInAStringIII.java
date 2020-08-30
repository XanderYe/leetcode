package easy;

/**
 * @author XanderYe
 * @description:
 * @date 2020/8/30 20:43
 */
public class No557ReverseWordsInAStringIII {
    public String reverseWords(String s) {
        int len = s.length();
        if (len == 0 || len == 1) {
            return s;
        }
        int i = 0;
        int j = 1;
        StringBuilder ans = new StringBuilder();
        while (i < len && j < len) {
            if (s.charAt(j) == ' ') {
                ans.append(new StringBuilder(s.substring(i, j)).reverse().toString()).append(" ");
                i = j + 1;
            }
            j++;
        }
        ans.append(new StringBuilder(s.substring(i, j)).reverse().toString());
        return ans.toString();
    }

    public static void main(String[] args) {
        System.out.println(new No557ReverseWordsInAStringIII().reverseWords("Let's take LeetCode contest"));
    }
}
