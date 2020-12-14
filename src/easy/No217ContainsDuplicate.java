package easy;

import java.util.HashSet;
import java.util.Set;

/**
 * @author XanderYe
 * @see <a href="https://leetcode-cn.com/problems/contains-duplicate/">217. 存在重复元素</a>
 * @date 2020/12/13 17:08
 */
public class No217ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new No217ContainsDuplicate().containsDuplicate(new int[]{1,2,3,1}));
        System.out.println(new No217ContainsDuplicate().containsDuplicate(new int[]{1,2,3,4}));
    }
}
