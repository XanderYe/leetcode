package easy;

public class MagicIndexLCCI {
    public int findMagicIndex(int[] nums) {
        for (int i=0;i<nums.length;i++){
            if (nums[i] == i) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0,2,3,4,5};
        System.out.println(new MagicIndexLCCI().findMagicIndex(nums));
    }
}
