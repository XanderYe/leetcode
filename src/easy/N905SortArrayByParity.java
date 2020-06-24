package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Xander on 2018-10-12.
 */
public class N905SortArrayByParity {
    public static void main(String[] args) {
        int[] A = {3, 1, 2, 4};
        int[] test = new N905SortArrayByParity().sortArrayByParity(A);
        for (int a : test) {
            System.out.println(a);
        }
    }

    public int[] sortArrayByParity(int[] A) {
        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();
        for (int a : A) {
            if (a % 2 == 0) {
                even.add(a);
            } else {
                odd.add(a);
            }
        }
        even.addAll(odd);
        int[] array = new int[even.size()];
        for (int i = 0; i < even.size(); i++) {
            array[i] = even.get(i);
        }
        return array;
    }
}
