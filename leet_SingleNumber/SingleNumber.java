package leet_SingleNumber;

import java.util.HashSet;

public class SingleNumber {
    public static void main(String[] args){
        int[] nums = new int[]{9,3,9,3,9,7,9};
        int unpaired = singleNumber(nums);
    }

    public static int singleNumber(int[] nums){
        if(nums.length <= 0) return 0;

        HashSet<Integer> numSet = new HashSet();
        for(int n : nums){
            if(numSet.contains(n)){
                numSet.remove(n);
            }
            else{
                numSet.add(n);
            }
        }
        return numSet.iterator().next();
    }
}
