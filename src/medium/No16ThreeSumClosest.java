package medium;

import java.util.Arrays;

/**
 * @author XanderYe
 * @date 2020/6/24
 */
public class No16ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        // 排序
        Arrays.sort(nums);
        int closestNum = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int l = i + 1, r = nums.length - 1;
            while (l < r){
                int threeSum = nums[l] + nums[r] + nums[i];
                if (Math.abs(threeSum - target) < Math.abs(closestNum - target)) {
                    closestNum = threeSum;
                }
                if (threeSum > target) {
                    r--;
                } else if (threeSum < target) {
                    l++;
                } else {
                    // 如果已经等于target的话, 肯定是最接近的
                    return target;
                }

            }

        }

        return closestNum;
    }

    public static void main(String[] args) {
        //System.out.println(new No16ThreeSumClosest().threeSumClosest(new int[]{0,0,0}, 1));
        //System.out.println(new No16ThreeSumClosest().threeSumClosest(new int[]{1,1,1,1}, 3));
        //System.out.println(new No16ThreeSumClosest().threeSumClosest(new int[]{0,2, 1, -3}, 1));
        System.out.println(new No16ThreeSumClosest().threeSumClosest(new int[]{1, 1, -1, -1, 3}, 3));
    }
}
