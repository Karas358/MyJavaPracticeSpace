package leet_PlusOne;

import java.util.ArrayList;
import java.util.List;

public class PlusOne {
    /**
     * Developer - Mfundo Falteni
     * @param {int[]} digits
     * @return {int[]}
    */
    public static void main(String[] args){
        
        //int[] digits = {1 , 2 , 3, 9};
        //int[] digits = {1 , 2 , 3, 4};
        //int[] digits = {0};
        //int[] digits = {};
        //int[] digits = {9};
        int[] digits = {9, 9};
        digits = addOne(digits);
    }

    public static int[] addOne(int[] digits) {
        if(digits.length == 0 || digits == null){
            int[] z = {1};
            return z;
        }
        List<Integer> digitsArr = new ArrayList<Integer>();
        for (int integer : digits) {
            digitsArr.add(integer);
        }
        int n = digitsArr.size() - 1;
        int rem = 0;
        if(digitsArr.get(n) == 9){
            digitsArr.set(n, 0);
            rem = 1;
        }else{
            digitsArr.set(n, (digitsArr.get(n) + 1));
        }
        while(rem > 0){
            if(n > 0){
                if(digitsArr.get(n - 1) == 9){
                    digitsArr.set(n - 1, 0); 
                    rem = 1;
                    n--;
                }
                else{
                    digitsArr.set(n - 1,(digitsArr.get(n - 1) + 1));
                    rem = 0;
                }
            }else{
                int[] arr = new int[digits.length + 1];
                arr[0] = 1;
                System.arraycopy(digitsArr.stream().mapToInt(i -> i).toArray(), 0, arr, 1, 1);
                return arr;    
            }
        }
        return digitsArr.stream().mapToInt(i -> i).toArray();
    }
}
