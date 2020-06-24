package easy;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * @author 叶振东
 * @date 2018-12-24
 */
public class No535EncodeAndDecodeTinyURL {
    static Map<String,String> map=new HashMap<>();
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String shortUrl="http://tinyurl.com/"+getShortUUID();
        map.put(shortUrl,longUrl);
        return shortUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }

    public static void main(String[] args) {
        No535EncodeAndDecodeTinyURL solution=new No535EncodeAndDecodeTinyURL();
        String longUrl="https://leetcode.com/problems/design-tinyurl";
        String shortUrl=solution.encode(longUrl);
        System.out.println("shortUrl:"+shortUrl);
        System.out.println("longUrl:"+solution.decode(shortUrl));
    }

    private static String[] chars = new String[]{
            "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z",
            "0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
            "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
    };


    private static String getShortUUID() {
        StringBuffer stringBuffer = new StringBuffer();
        String uuid = UUID.randomUUID().toString().replace("-", "");
        /* 32 -> 8 */
        for (int i = 0; i < 8; i++) {
            String str = uuid.substring(i * 4, i * 4 + 4);
            // 16进制为基解析
            int strInteger = Integer.parseInt(str, 16);
            // 0x3E -> 字典总数 62
            stringBuffer.append(chars[strInteger % 0x3E]);
        }
        return stringBuffer.toString();
    }
}
