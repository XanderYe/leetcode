package easy;

import java.util.*;

/**
 * Created on 2020/10/28.
 * @see <a href="https://leetcode-cn.com/problems/unique-number-of-occurrences/">1207. 独一无二的出现次数</a>
 * @author 叶振东
 */
public class No1207UniqueNumberOfOccurrences {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.merge(num, 1, Integer::sum);
        }
        List<Integer> list = new ArrayList<>(map.values());
        Set<Integer> set = new HashSet<>(map.values());
        return list.size() == set.size();
    }

    public static void main(String[] args) {
        int[] arr = new int[]{26,2,16,16,5,5,26,2,5,20,20,5,2,20,2,2,20,2,16,20,16,17,16,2,16,20,26,16};
        System.out.println(new No1207UniqueNumberOfOccurrences().uniqueOccurrences(arr));
    }
}
