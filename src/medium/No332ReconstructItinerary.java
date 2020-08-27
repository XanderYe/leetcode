package medium;

import java.util.*;

/**
 * Created on 2020/8/27.
 *
 * @author 叶振东
 */
public class No332ReconstructItinerary {
    Map<String, PriorityQueue<String>> map = new HashMap<>();
    List<String> ans = new LinkedList<>();

    public List<String> findItinerary(List<List<String>> tickets) {
        for (List<String> ticket : tickets) {
            String from = ticket.get(0);
            String to = ticket.get(1);
            if (!map.containsKey(from)) {
                map.put(from, new PriorityQueue<>());
            }
            map.get(from).offer(to);
        }
        dfs("JFK");
        Collections.reverse(ans);
        return ans;
    }
    public void dfs(String cur) {
        while (map.containsKey(cur) && map.get(cur).size() > 0) {
            String tmp = map.get(cur).poll();
            dfs(tmp);
        }
        ans.add(cur);
    }

    public static void main(String[] args) {
        List<List<String>> tickets = new ArrayList<List<String>>(){{
            add(Arrays.asList("MUC", "LHR"));
            add(Arrays.asList("JFK", "MUC"));
            add(Arrays.asList("SFO", "SJC"));
            add(Arrays.asList("LHR", "SFO"));
        }};
        List<String> ans = new No332ReconstructItinerary().findItinerary(tickets);
        ans.forEach(System.out::println);
    }
}
