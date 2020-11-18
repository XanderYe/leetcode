package medium;

/**
 * Created on 2020/11/18.
 * @see <a href="https://leetcode-cn.com/problems/gas-station/">134. 加油站</a>
 * @author 叶振东
 */
public class No134GasStation {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int len = gas.length;
        for (int i = 0; i < len; i++) {
            int sum = gas[i];
            int last = i;
            for (int j = 0; j < len; j++) {
                int index = (i + j + 1) % len;
                sum = sum - cost[last];
                if (sum < 0) {
                    break;
                }
                sum += gas[index];
                last = index;
            }
            if (sum >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new No134GasStation().canCompleteCircuit(new int[]{1,2,3,4,5}, new int[]{3,4,5,1,2}));
        System.out.println(new No134GasStation().canCompleteCircuit(new int[]{2,3,4}, new int[]{3,4,3}));
        System.out.println(new No134GasStation().canCompleteCircuit(new int[]{5,8,2,8}, new int[]{6,5,6,6}));
    }
}
