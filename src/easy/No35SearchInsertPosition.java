package easy;

/**
 * Created by YE on 2018-10-17.
 */
public class No35SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums={1, 3, 5, 6};
        System.out.println(new No35SearchInsertPosition().searchInsert(nums,0));
    }


    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l;
    }

    public int searchInsert2(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(target<=nums[i]){
                return i;
            }
        }
        return nums.length;
    }
}
