package leet_RemoveDuplicates;


public class RemoveDuplicates {

    public static void main(String[] args){
        //int[] nums = {2,2,3,4};
        //int[] nums = {3,3};
        //int[] nums = {3};
        //int[] nums = {4,5};
        //int[] nums = {2,2,3};
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int j = removeDuplicatesInArray(nums);
    }
    public static int removeDuplicatesInArray(int[] nums) {
         int temp = 0;
         int n = nums.length - 1;
         int count = 1;
         for(int x = 0; x < n;x++){
             for(int z = x + 1; z < n + 1 ;z++){
                 if(nums[x] != nums[z]){
                     count++;
                     temp = nums[x + 1];
                     nums[x + 1] = nums[z];
                     nums[z] = temp;
                     x++;
                 }
                 if(z == n) return count;
             }
         }
         return count; 
     }
}
