package easy;

/**
 * Created by Xander on 2018-10-12.
 */
public class No344ReverseString {
    public static void main(String[] args) {
        System.out.println(new No344ReverseString().reverseString("hello"));
    }
    public String reverseString(String s) {
        char[] c=s.toCharArray();
        char tmp;
        for(int i=0;i<c.length/2;i++){
            tmp=c[i];
            c[i]=c[c.length-1-i];
            c[c.length-1-i]=tmp;
        }
        return new String(c);
    }
}
