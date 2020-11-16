package medium;

/**
 * Created on 2020/11/16.
 * @see <a href="https://leetcode-cn.com/problems/remove-k-digits">402. 移掉K位数字</a>
 * @author 叶振东
 */
public class No402RemoveKDigits {
    public String removeKdigits(String num, int k) {
        if (num.length() == k) {
            return "0";
        }
        StringBuilder sb = new StringBuilder(num);
        for (int i = 0; i < k; i++) {
            int index = 0;
            for (int j = 1; j < sb.length() && sb.charAt(j) >= sb.charAt(j - 1); j++) {
                index++;
            }
            sb.delete(index, index + 1);
            while (sb.length() > 1 && sb.charAt(0) == '0') {
                sb.delete(0, 1);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new No402RemoveKDigits().removeKdigits("1432219", 3));
        System.out.println(new No402RemoveKDigits().removeKdigits("10200", 1));
        System.out.println(new No402RemoveKDigits().removeKdigits("10", 2));
        System.out.println(new No402RemoveKDigits().removeKdigits("9", 1));
        System.out.println(new No402RemoveKDigits().removeKdigits("112", 1));
    }
}
