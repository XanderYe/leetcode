package hard;

import java.util.Arrays;

/**
 * Created by Xander on 2018-10-12.
 */
public class No164MaximumGap {
    public static void main(String[] args) {
        int[] nums={3,6,9,1};
        System.out.println(new No164MaximumGap().maximumGap(nums));
    }
    public int maximumGap(int[] nums) {
        int max=0;
        if(nums.length<2){
            return 0;
        }
        Arrays.sort(nums);
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]-nums[i-1]>max){
                max=nums[i]-nums[i-1];
            }
        }
        return max;
    }
}
