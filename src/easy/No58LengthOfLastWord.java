package easy;

/**
 * Created by YE on 2018-10-18.
 */
public class No58LengthOfLastWord {
    public static void main(String[] args) {
        String s="        ";
        System.out.println(new No58LengthOfLastWord().lengthOfLastWord(s));
    }
    public int lengthOfLastWord(String s) {
        String[] words=s.split(" ");
       if(words.length==0) return 0;
       else{
           String last=words[words.length-1];
           return last.length();
       }
    }
}
