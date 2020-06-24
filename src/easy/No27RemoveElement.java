package easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Xander on 2018-09-21.
 */
public class No27RemoveElement {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) {
            return 0;
        }
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] s = new int[]{1, 2, 3, 4, 6, 7, 8};
        No27RemoveElement no27RemoveElement = new No27RemoveElement();
        int length=no27RemoveElement.removeElement(s, 1);
        for(int i=0;i<length;i++){
            System.out.print(s[i]+" ");
        }
    }
}
