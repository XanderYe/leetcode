package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created on 2020/8/31.
 *
 * @author 叶振东
 */
public class No841KeysAndRooms {
    boolean[] visited;
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int len = rooms.size();
        visited = new boolean[len];
        visited[0] = true;
        for (int i = 0; i < len; i++) {
            dfs(rooms, i);
        }
        for (int i = 0; i < len; i++) {
            if (!visited[i]) {
                return false;
            }
        }
        return true;
    }
    public void dfs(List<List<Integer>> rooms, int next) {
        if (visited[next]) {
            List<Integer> keys = rooms.get(next);
            for (int key : keys) {
                if (!visited[key]) {
                    visited[key] = true;
                    dfs(rooms, key);
                }
            }
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> rooms = new ArrayList<>();
        rooms.add(Arrays.asList(1, 3));
        rooms.add(Arrays.asList(3, 0, 1));
        rooms.add(Arrays.asList(3));
        rooms.add(Arrays.asList(0));
        System.out.println(new No841KeysAndRooms().canVisitAllRooms(rooms));
    }
}
