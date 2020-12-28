package easy;

import java.util.Arrays;

/**
 * Created on 2020/12/25.
 * @see <a href="https://leetcode-cn.com/problems/assign-cookies/">455. 分发饼干</a>
 * @author 叶振东
 */
public class No455AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        int child = 0;
        int cookie = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        while (child < g.length && cookie < s.length) {
            if (g[child] <= s[cookie]) {
                child++;
            }
            cookie++;
        }
        return child;
    }

    public static void main(String[] args) {
        No455AssignCookies assignCookies = new No455AssignCookies();
        System.out.println(assignCookies.findContentChildren(new int[]{1,2,3}, new int[]{1,1}));
    }
}
