package easy;

/**
 * @author 叶振东
 * @date 2019-06-15
 */
public class No67AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder builder = new StringBuilder();
        int m = a.length() - 1;
        int n = b.length() - 1;
        int cal = 0;
        while (m >= 0 || n >= 0) {
            cal += m >= 0 ? a.charAt(m--) - '0' : 0;
            cal += n >= 0 ? b.charAt(n--) - '0' : 0;
            builder.append(cal % 2);
            cal = cal / 2;
        }
        builder.append(cal == 0 ? "" : cal);
        return builder.reverse().toString();
    }

    public static void main(String[] args) {
        No67AddBinary no67AddBinary = new No67AddBinary();
        System.out.println(no67AddBinary.addBinary("1010", "11011"));
    }
}
