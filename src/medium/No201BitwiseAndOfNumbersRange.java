package medium;

/**
 * Created on 2020/8/24.
 *
 * @author 叶振东
 */
public class No201BitwiseAndOfNumbersRange {
    public int rangeBitwiseAnd(int m, int n) {
        int shift = 0;
        while (m < n) {
            m >>= 1;
            n >>= 1;
            ++shift;
        }
        return m << shift;
    }

    public static void main(String[] args) {
        System.out.println(new No201BitwiseAndOfNumbersRange().rangeBitwiseAnd(5,7));
    }
}
