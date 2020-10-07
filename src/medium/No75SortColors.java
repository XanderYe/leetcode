package medium;

/**
 * @author XanderYe
 * @see <a href="https://leetcode-cn.com/problems/sort-colors/submissions/">75. 颜色分类</a>
 * @date 2020/10/7 10:58
 */
public class No75SortColors {
    public void sortColors(int[] nums) {
        int len = nums.length;
        if (len < 2) {
            return;
        }
        int p = 0, q = len - 1;
        for (int i = 0; i <= q; ++i)
        {
            if (nums[i] == 0)
            {
                nums[i] = nums[p];
                nums[p] = 0;
                ++p;
            }
            if (nums[i] == 2)
            {
                nums[i] = nums[q];
                nums[q] = 2;
                --q;
                --i;
            }
        }
    }
}
