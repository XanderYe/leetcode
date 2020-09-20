package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created on 2020/9/20.
 * @see <a href="https://leetcode-cn.com/problems/subsets/">78. 子集</a>
 * @author 叶振东
 */
public class No78Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        for (int i = 0; i < nums.length; i++) {
            int all = res.size();
            for (int j = 0; j < all; j++) {
                List<Integer> tmp = new ArrayList<>(res.get(j));
                tmp.add(nums[i]);
                res.add(tmp);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3};
        System.out.println(new No78Subsets().subsets(nums));
    }
}
