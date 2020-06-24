package easy;

/**
 * Created by Xander on 2018-09-18.
 */
public class No9PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x > Integer.MAX_VALUE || x < Integer.MIN_VALUE) {
            return false;
        }
        String y = String.valueOf(x);
        char[] c = y.toCharArray();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = c.length - 1; i >= 0; i--) {
            stringBuffer.append(c[i]);
        }

        String z = stringBuffer.toString();
        if (y.equals(z)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        No9PalindromeNumber no9PalindromeNumber = new No9PalindromeNumber();
        System.out.println(no9PalindromeNumber.isPalindrome(-121));
    }
}
