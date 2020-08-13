package medium;

/**
 * Created on 2020/8/13.
 *
 * @author 叶振东
 */
public class No43MultiplyStrings {
    public String multiply(String num1, String num2) {
        int m = num1.length() - 1;
        int n = num2.length() - 1;
        String ans = "0";
        for (int j = n; j >= 0; j--) {
            StringBuilder sb1 = new StringBuilder();
            int tmp = 0;
            int i = m;
            int o = num2.charAt(j) - '0';
            for (int k = j; k < n; k++) {
                sb1.append("0");
            }
            while (i >= 0 || tmp > 0) {
                if (i >= 0) {
                    tmp = tmp + (num1.charAt(i) - '0') * o;
                    i--;
                }
                sb1.append(tmp % 10);
                tmp /= 10;
            }
            for (int k = sb1.length() - 1; k > 0; k--) {
                if (sb1.charAt(k) == '0') {
                    sb1.deleteCharAt(k);
                } else {
                    break;
                }
            }
            ans = addString(ans, sb1.reverse().toString());
        }
        return ans;
    }

    public String addString(String num1, String num2) {
        int result = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        StringBuilder ans = new StringBuilder();
        while (i >= 0 || j >= 0 || result != 0) {
            int x = i >= 0 ? num1.charAt(i) - '0' : 0;
            int y = j >= 0 ? num2.charAt(j) - '0' : 0;
            result = result + x + y;
            ans.append(result % 10);
            result /= 10;
            i--;
            j--;
        }
        return ans.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(new No43MultiplyStrings().multiply("2", "3"));
        System.out.println(new No43MultiplyStrings().multiply("9133", "0"));
    }
}
