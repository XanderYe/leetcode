package easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created on 2020/12/10.
 * @see <a href="https://leetcode-cn.com/problems/lemonade-change/">860. 柠檬水找零</a>
 * @author 叶振东
 */
public class No860LemonadeChange {
    public boolean lemonadeChange(int[] bills) {
        int five = 0;
        int ten = 0;
        for (int i = 0; i < bills.length; i++) {
            if (i == 0 && bills[i] != 5) {
                return false;
            }
            if (bills[i] == 5) {
                five++;
            } else if (bills[i] == 10) {
                if (five == 0) {
                    return false;
                } else {
                    five--;
                    ten++;
                }
            } else {
                if (five > 0 && ten > 0) {
                    five--;
                    ten--;
                } else if (five > 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(new No860LemonadeChange().lemonadeChange(new int[]{5,5,5,10,20}));
        System.out.println(new No860LemonadeChange().lemonadeChange(new int[]{10,10}));
        System.out.println(new No860LemonadeChange().lemonadeChange(new int[]{5,5,10,10,20}));
    }
}
