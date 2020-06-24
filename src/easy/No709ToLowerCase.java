package easy;

/**
 * Created by Xander on 2018-10-12.
 */
public class No709ToLowerCase {
    public static void main(String[] args) {
        String str = "DSFASDASsaddDASDda";
        System.out.println(new No709ToLowerCase().toLowerCase(str));
    }

    public String toLowerCase(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                stringBuffer.append((char) (str.charAt(i) + 32));
            } else {
                stringBuffer.append(str.charAt(i));
            }
        }
        return stringBuffer.toString();
    }
}
