package leet_RemoveElement;
import java.util.*;


public class RemoveElement {

    public static void main(String[] args){
        //int[] nums = {3,2,2,3};
        //int val = 3;
        //int[] nums = {3,3};
        //int val = 3;
        //int[] nums = {3};
        //int val = 3;
        //int[] nums = {4,5};
        //int val = 5;
        int[] nums = {2,2,3};
        int val = 2;
        int j = removeElement(nums, val);
    }
    public static int removeElement(int[] nums, int val){
        int i = 0;
        for(int x = 0; x < nums.length; x++){
            if(nums[x] != val) 
            {
                nums[i] = nums[x];
                i++;
            }
        }
        return i;
    }
    /* public static int removeElement(int[] nums, int val) {
        int temp = 0;
        int countMatch = 0;

        if(validateNums(nums, val)) return 0;
        int right = nums.length - 1;
        for(int x = 0; x  < right; x++){
            while(nums[right] == val){
                countMatch++;
                if(right == 0) return nums.length - countMatch;
                right--;
            }
            if(nums[x] == val){
                temp = nums[x];
                nums[x] = nums[right];
                nums[right] = temp;

                //Think Boeta
                
                right--;
                countMatch++;
                
            }
        }
        return nums.length - countMatch;
    }

    public static boolean validateNums(int[] nums,int val){
        if(nums.length == 1){
             return nums[0] == val;
        }
        return false;
    }  */

    
}
