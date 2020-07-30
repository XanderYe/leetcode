package medium;

/**
 * Created on 2020/7/30.
 *
 * @author 叶振东
 */
public class No343IntegerBreak {
    public int integerBreak(int n) {
        if (n < 4) {
            return n - 1;
        }
        int ans = 1;
        while (n > 4) {
            n -= 3;
            ans *= 3;
        }
        return ans * n;
    }

    public static void main(String[] args) {
        System.out.println(new No343IntegerBreak().integerBreak(7));
        System.out.println(new No343IntegerBreak().integerBreak(8));
        System.out.println(new No343IntegerBreak().integerBreak(9));
        System.out.println(new No343IntegerBreak().integerBreak(10));
    }
}
