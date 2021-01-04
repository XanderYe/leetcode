package easy;

import util.CheckUtil;

/**
 * Created on 2021/1/4.
 * @see <a href="https://leetcode-cn.com/problems/fibonacci-number/">509. 斐波那契数</a>
 * @author 叶振东
 */
public class No509FibonacciNumber {
    public int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        No509FibonacciNumber solution  = new No509FibonacciNumber();
        CheckUtil.check(solution.fib(2) == 1);
        CheckUtil.check(solution.fib(3) == 2);
        CheckUtil.check(solution.fib(4) == 3);
    }
}
