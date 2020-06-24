package easy;

/**
 * Created by Xander on 2018-09-18.
 */
public class No7ReverseInteger {
    public int reverse(int x) {
        try {
            int y = Math.abs(x);
            StringBuffer stringBuffer = new StringBuffer();
            char[] c = String.valueOf(y).toCharArray();
            for (int i = c.length - 1; i >= 0; i--) {
                stringBuffer.append(c[i]);
            }
            return x > 0 ? Integer.valueOf(stringBuffer.toString()) : -Integer.valueOf(stringBuffer.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
    }

    public static void main(String[] args) {
        No7ReverseInteger no7ReverseInteger = new No7ReverseInteger();
        System.out.println(no7ReverseInteger.reverse(1534236469));
    }
}
