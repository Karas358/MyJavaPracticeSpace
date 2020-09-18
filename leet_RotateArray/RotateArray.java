package leet_RotateArray;

public class RotateArray {

    public static void main(String[] args){
        //int[] nums = {1,2,3,4,5,6,7};
        int[] nums = {1,2};
        nums = rotate(nums, 3);
    }

    public static int[] rotate(int[] nums, int k){
        int temp;
        int numsLen = nums.length;
        int y = numsLen;
        for(int x = 0; x < k; x++){
            temp = nums[numsLen - 1];
            while(y > 1){
                nums[y - 1] = nums[y - 2];
                y--;
            }
            y = numsLen;
            nums[0] = temp;
        }
        return nums;
    }
}
