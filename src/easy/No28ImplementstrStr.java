package easy;

/**
 * Created by YE on 2018-10-15.
 */
public class No28ImplementstrStr {
    public static void main(String[] args) {
        String haystack = "a";
        String needle = "a";
        System.out.println(new No28ImplementstrStr().strStr(haystack, needle));
    }

    public int strStr(String haystack, String needle) {
        if(haystack==null || needle==null) return 0;
        if(needle.length()==0) return 0;
        if(haystack.length()>=needle.length()){
            for (int i = 0; i < haystack.length(); i++) {
                if (haystack.charAt(i) == needle.charAt(0)) {
                    if (haystack.length()-i>=needle.length()&&haystack.substring(i, i + needle.length()).equals(needle)) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}
