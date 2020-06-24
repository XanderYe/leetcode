package easy;

/**
 * Created by YE on 2018-10-17.
 */
public class No35SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums={3,5,7,9};
        System.out.println(new No35SearchInsertPosition().searchInsert(nums,1));
    }
    public int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(target<=nums[i]){
                return i;
            }
        }
        return nums.length;
    }
}
