package medium;

/**
 * Created on 2020/12/15.
 * @see <a href="https://leetcode-cn.com/problems/monotone-increasing-digits/">738. 单调递增的数字</a>
 * @author 叶振东
 */
public class No738MonotoneIncreasingDigits {
    public int monotoneIncreasingDigits(int N) {
        int i = 1;
        int res = N;
        while (i <= res / 10) {
            int n = res / i % 100;
            i *= 10;
            if (n / 10 > n % 10) {
                res = res / i * i - 1;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new No738MonotoneIncreasingDigits().monotoneIncreasingDigits(10));
        System.out.println(new No738MonotoneIncreasingDigits().monotoneIncreasingDigits(1234));
        System.out.println(new No738MonotoneIncreasingDigits().monotoneIncreasingDigits(332));
        System.out.println(new No738MonotoneIncreasingDigits().monotoneIncreasingDigits(747131058));
    }
}
