package easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 面试题 16.11. 跳水板
 * Created on 2020/7/8.
 *
 * @author 叶振东
 */
public class DivingBoardLCCI {
    public int[] divingBoard(int shorter, int longer, int k) {
        if (k == 0) {
            return new int[0];
        }
        if (shorter == longer) {
            return new int[]{shorter * k};
        }
        List<Integer> list = new ArrayList<>();
        int start = shorter * k;
        list.add(start);
        for (int i = 0; i < k; i++) {
            start += longer - shorter;
            list.add(start);
        }
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] ans = new DivingBoardLCCI().divingBoard(1, 2, 3);
        System.out.println(Arrays.toString(ans));
    }
}
