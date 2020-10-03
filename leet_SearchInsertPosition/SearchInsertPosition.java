package leet_SearchInsertPosition;

public class SearchInsertPosition {

    /**
     * Developer - Mfundo Falteni
     * @param {int[]} nums
     * @return {int}
    */
    public static void main(String[] args){
        
        /* int[] nums = {1, 3, 5 , 6};
        int target = 7;
        Ans 4
        ======
        int[] nums = {1, 3, 5 , 6};
        int target = 5; 
        //Ans 2
        ======
        int[] nums = {1, 3, 5 , 6};
        int target = 2; 
        //Ans 1
        ======
        int[] nums = {1, 3, 5 , 6};
        int target = 4;
        //Ans 2
        ======
        int[] nums = {1, 3, 5 , 6};
        int target = 0;
        //Ans 0
        ======
        int[] nums = {1, 3, 5 , 6};
        int target = 8; 
        //Ans 4
        */
        int[] nums = {1, 3, 5 , 6};
        int target = 5; 
        //Ans 2
        int retarget = searchInsertPosition(nums, target);
    }
    public static int searchInsertPosition(int[] nums, int target){
        int len = nums.length;
        for(int x = 0; x < len;x++) {
            if(target <= nums[x]) return x;
        }
        return len;
    }

}
