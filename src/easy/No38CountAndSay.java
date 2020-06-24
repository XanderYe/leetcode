package easy;

/**
 * @author 叶振东
 * @date 2019-06-15
 */
public class No38CountAndSay {
    public String countAndSay(int n) {
        String init = "1";
        for (int i = 2; i <= n; i++) {
            int count = 1;
            char pre = init.charAt(0);
            StringBuilder sb = new StringBuilder();
            for (int j = 1; j < init.length(); j++) {
                char c = init.charAt(j);
                if (c == pre) {
                    count++;
                } else {
                    sb.append(count).append(pre);
                    count = 1;
                    pre = c;
                }
            }
            sb.append(count).append(pre);
            init = sb.toString();
        }
        return init;
    }

    public static void main(String[] args) {
        int n = 3;
        No38CountAndSay no38CountAndSay = new No38CountAndSay();
        System.out.println(no38CountAndSay.countAndSay(n));
    }
}
