package hard;

import structure.ListNode;

/**
 * Created by Xander on 2018-10-12.
 */
public class No493ReversePairs {
    public static void main(String[] args) {
        int nums2[]={1,3,2,3,1};
        int nums[]={2147483647,2147483647,2147483647,2147483647,2147483647,2147483647};
        System.out.println(new No493ReversePairs().reversePairs(nums));
    }
    public int reversePairs(int[] nums) {
        int res=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>0&&nums[j]<0){
                    res++;
                }else if(nums[i] > 2*(long)nums[j]){
                    res++;
                }
            }
        }
        return res;
    }
}
