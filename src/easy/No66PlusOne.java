package easy;

/**
 * Created by YE on 2018-10-18.
 */
public class No66PlusOne {
    public static void main(String[] args) {
        int[] digits={9,8,7};
        digits=new No66PlusOne().plusOne2(digits);
        for(int i=0;i<digits.length;i++){
            System.out.println(digits[i]);
        }
    }
    public int[] plusOne(int[] digits) {
        int[] array=new int[digits.length+1];
        array[0]=1;
        digits[digits.length-1]+=1;
        for(int i=digits.length-1;i>0;i--){
            if(digits[i]>=10){
                digits[i-1]+=digits[i]-9;
                digits[i]-=10;
            }
        }
        if(digits[0]>=10){
            digits[0]-=10;
            for(int i=1;i<array.length;i++){
                array[i]=digits[i-1];
            }
            return array;
        }
        return digits;
    }
    public int[] plusOne2(int[] digits) {
        int len = digits.length;
        int[] array = new int[len + 1];
        array[0] = 1;

        if(digits[len-1] != 9){
            digits[len-1]++;
            return digits;
        }
        else {
            for(int i = len -1; i > 0;i--){
                digits[i] = 0;
                if(digits[i - 1] != 9){
                    digits[i-1]++;
                    return digits;
                }
            }
            return array;

        }
    }
}
