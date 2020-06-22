package medium;

/**
 * 面试题16.18 模式匹配
 * Created on 2020/6/22.
 *
 * @author 叶振东
 */
public class PatternMatchingLCCI {
    public boolean patternMatching(String pattern, String value) {
        if (pattern.equals(value)) {
            return true;
        }
        int aIndex = pattern.indexOf('a');
        int bIndex = pattern.indexOf('b');
        boolean isReplace = aIndex > 0;
        int aNum = 0;
        int bNum = 0;
        for (int i = 0; i < pattern.length(); i++) {
            if (pattern.charAt(i) == 'a') {
                aNum++;
            }
            if (pattern.charAt(i) == 'b') {
                bNum++;
            }
        }
        if (isReplace) {
            int temp = aNum;
            aNum = bNum;
            bNum = temp;
            bIndex = aIndex;
        }
        String a;
        String b;
        int aLength = aNum == 0 ? 0 : value.length() / aNum;
        for (int i = 0; i <= aLength; i++) {
            a = value.substring(0, i);
            int bLength = bNum == 0 ? 0 : (value.length() - aNum * a.length()) / bNum;
            b = bIndex == -1 ? "" : value.substring(bIndex * a.length(), bIndex * a.length() + bLength);
            if (a.equals(b) && aNum == bNum) {
                continue;
            }
            StringBuilder stringBuilder = new StringBuilder();
            for (int k = 0; k < pattern.length(); k++) {
                if (pattern.charAt(k) == 'a') {
                    stringBuilder.append(isReplace ? b : a);
                } else {
                    stringBuilder.append(isReplace ? a : b);
                }
            }
            String s = stringBuilder.toString();
            if (s.length() == value.length() && value.equals(s)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(new PatternMatchingLCCI().patternMatching("aaaa", "dogcatcatdog"));
    }
}
