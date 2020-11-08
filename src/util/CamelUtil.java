package util;

/**
 * @author XanderYe
 * @description:
 * @date 2020/11/8 10:10
 */
public class CamelUtil {
    public static String toCamel(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append((char) (s.charAt(0) - 32));
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == '-' && i < s.length() - 1) {
                char next = s.charAt(i + 1);
                sb.append((char) (next - 32));
                i++;
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString().replaceAll("Ii$", "II");
    }

    public static void main(String[] args) {
        System.out.println(toCamel("best-time-to-buy-and-sell-stock-ii"));
    }
}
