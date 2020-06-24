package medium;

/**
 * @author 叶振东
 * @date 2019-06-17
 */
public class No151ReverseWordsInAString {
    public String reverseWords(String s) {
        String[] strings = s.split(" ", -1);
        StringBuilder builder = new StringBuilder();
        if (strings.length > 0) {
            for (int i = strings.length - 1; i >= 0; i--) {
                if (!"".equals(strings[i])) {
                    builder.append(strings[i]).append(" ");
                }
            }
        }
        if (builder.length() > 0) {
            builder.deleteCharAt(builder.length() - 1);
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(new No151ReverseWordsInAString().reverseWords("the sky is blue"));
    }
}
