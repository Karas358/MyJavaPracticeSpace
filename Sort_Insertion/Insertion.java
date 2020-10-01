package Sort_Insertion;

public class Insertion {
    public static void main(String[] args){
        int[] sort = {4,3,2,10,12,5,6};
        sort = insertionSort(sort);
    }

    public static int[] insertionSort(int[] nums){
        int rightCur = 1;
        int curVal = 0;
        int numSwap = 0;
        int len = nums.length;
        while(rightCur < len){
           for(int x = 0; x < rightCur;x++){
               if(nums[x] > nums[rightCur]){
                    numSwap = nums[rightCur];
                    curVal = rightCur;
                    while(curVal > x){
                        nums[curVal] = nums[curVal - 1];
                        curVal--;
                    }
                    nums[x] = numSwap;
               }
           }
           rightCur++;
        }
        return nums;
    }
}
