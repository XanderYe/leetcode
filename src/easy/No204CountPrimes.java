package easy;

/**
 * Created on 2020/12/3.
 * @see <a href="https://leetcode-cn.com/problems/count-primes/">204. 计数质数</a>
 * @author 叶振东
 */
public class No204CountPrimes {
    public int countPrimes(int n) {
        int count = 0;
        for (int i = 2; i < n; ++i) {
            count += isPrime(i) ? 1: 0;
        }
        return count;
    }

    public boolean isPrime(int x) {
        for (int i = 2; i * i <= x; ++i) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        No204CountPrimes solution = new No204CountPrimes();
        System.out.println(solution.countPrimes(10));
        System.out.println(solution.countPrimes(0));
        System.out.println(solution.countPrimes(1));
    }
}
