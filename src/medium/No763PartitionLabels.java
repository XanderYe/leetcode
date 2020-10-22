package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created on 2020/10/22.
 * @see <a href="https://leetcode-cn.com/problems/partition-labels/">763. 划分字母区间</a>
 * @author 叶振东
 */
public class No763PartitionLabels {
    public List<Integer> partitionLabels(String S) {
        int start = 0, end = 0;
        List<Integer> ans = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < S.length(); i++) {
            map.put(S.charAt(i), i);
        }
        for (int i = 0; i < S.length(); i++) {
            end = Math.max(end, map.get(S.charAt(i)));
            if (i == end) {
                ans.add(end - start + 1);
                start = end + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        List<Integer> ans = new No763PartitionLabels().partitionLabels("ababcbacadefegdehijhklij");
        System.out.println(ans.toString());
    }
}
