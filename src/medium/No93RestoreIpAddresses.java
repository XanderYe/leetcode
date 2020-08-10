package medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class No93RestoreIpAddresses {
    List<String> ans = new ArrayList<>();
    LinkedList<String> queue = new LinkedList<>();

    public List<String> restoreIpAddresses(String s) {
        dfs(s, 0);
        return ans;
    }

    public void dfs(String s, int start) {
        if (queue.size() == 4) {
            if (start == s.length()) {
                StringBuilder stringBuilder = new StringBuilder();
                for (int i = 0; i < 4; i++) {
                    stringBuilder.append(queue.get(i)).append(".");
                }
                ans.add(stringBuilder.deleteCharAt(stringBuilder.length() - 1).toString());
            } else {
                return;
            }
        }
        for (int i = 1; i <= 3; i++) {
            if (start + i > s.length()) {
                return;
            }
            if (i != 1 && s.charAt(start) == '0') {
                return;
            }
            String n = s.substring(start, start + i);
            if (i == 3 && Integer.parseInt(n) > 255) {
                return;
            }
            queue.add(n);
            dfs(s, start + i);
            queue.removeLast();
        }
    }

    public static void main(String[] args) {
        List<String> list = new No93RestoreIpAddresses().restoreIpAddresses("010010");
        list.forEach(System.out::println);
    }
}
