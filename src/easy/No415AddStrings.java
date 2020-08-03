package easy;

/**
 * Created on 2020/8/3.
 *
 * @author 叶振东
 */
public class No415AddStrings {
    public String addStrings(String num1, String num2) {
        int m = num1.length() - 1;
        int n = num2.length() - 1;
        int tmp = 0;
        StringBuilder sb = new StringBuilder();
        while (m >= 0 || n >= 0 || tmp != 0) {
            if (m >= 0) {
                tmp += num1.charAt(m--) - '0';
            }
            if (n >= 0) {
                tmp += num2.charAt(n--) - '0';
            }
            sb.append(tmp % 10);
            tmp /= 10;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(new No415AddStrings().addStrings("1", "9"));
    }
}
