package leet_PlusOne;

public class PlusOne {
    public static void main(String[] args){
        
        //int[] digits = {1 , 2 , 3, 9};
        //int[] digits = {1 , 2 , 3, 4};
        //int[] digits = {0};
        int[] digits = {9};
        digits = addOne(digits);
    }

    public static int[] addOne(int[] digits) {
        int n = digits.length - 1;
        int rem = 0;
        if(digits[n] == 9){
            digits[n] = 0;
            rem = 1;
        }else{
            digits[n] = digits[n] + 1;
        }
        while(rem > 0){
            if(digits[n - 1] == 9){
                digits[n - 1] = 0;
                rem = 1;
                n--;
            }
            else{
                digits[n - 1] = digits[n - 1] + 1;
                rem = 0;
            }
        }
        return digits;
    }
}
