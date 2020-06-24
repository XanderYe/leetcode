package easy;

/**
 * Created by Xander on 2018-10-12.
 */
public class No771JewelsandStones {

    public static void main(String[] args) {
        String J = "aA";
        String S = "aAAbbbb";
        System.out.println(new No771JewelsandStones().numJewelsInStones(J, S));
    }

    public int numJewelsInStones(String J, String S) {
        int sum = 0;
        for (int i = 0; i < S.length(); i++) {
            for (int k = 0; k < J.length(); k++) {
                if (S.charAt(i) == J.charAt(k)) {
                    sum++;
                }
            }
        }
        return sum;
    }
}
