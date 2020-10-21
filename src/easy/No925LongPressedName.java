package easy;

/**
 * Created on 2020/10/21.
 * @see <a href="https://leetcode-cn.com/problems/long-pressed-name/">925. 长按键入</a>
 * @author 叶振东
 */
public class No925LongPressedName {
    public boolean isLongPressedName(String name, String typed) {
        int i = 0, j = 0;
        while (j < typed.length()) {
            if (i < name.length() && name.charAt(i) == typed.charAt(j)) {
                i++;
                j++;
            } else if (j > 0 && typed.charAt(j) == typed.charAt(j - 1)) {
                j++;
            } else {
                return false;
            }
        }
        return i == name.length();
    }

    public static void main(String[] args) {
        System.out.println(new No925LongPressedName().isLongPressedName("alex", "alleex"));
        System.out.println(new No925LongPressedName().isLongPressedName("alex", "alleexx"));
        System.out.println(new No925LongPressedName().isLongPressedName("alex", "allexr"));
        System.out.println(new No925LongPressedName().isLongPressedName("pyplrz", "ppyypllr"));
    }
}
