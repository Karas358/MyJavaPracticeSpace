package Sort_Selection;

public class Selection {
    public static void main(String[] args){
        int[] nums = {20 , 12, 10, 15, 2};
        nums = selectionSort(nums);
    }

    public static int[] selectionSort(int[] nums){
        int curLeft = 0;
        int curMin;
        int len = nums.length;
        int temp = 0;

        while(curLeft < len){
            curMin  = curLeft;
            for(int x = curLeft + 1; x < len; x++){
                if(nums[curMin] > nums[x]) curMin = x;
            }
            temp = nums[curLeft];
            nums[curLeft] = nums[curMin];
            nums[curMin] = temp;
            curLeft++;
        }
        return nums;
    }
}
