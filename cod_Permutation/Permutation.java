package cod_Permutation;

import java.util.ArrayList;
import java.util.List;

public class Permutation{
    public static void main(String[] args){
        int[] arrCount = new int[]{2 , 3 , 1 , 5};
        int unpaired = solutionEverGreen(arrCount);
        System.out.println(unpaired + "");
    }
    public static int solutionEverGreen(int[] A){

        if (A.length > 100000){
            return -1;
        }else
        {
            A = Sort(A);
            int len = A.length;
            if(len == 1)
            {
                if(A[0] == 1)
                {
                    return 2;
                }else
                {
                    return 1;
                }
            }else if(len == 0)
            {
                return 1;
            }
            else
            {
                List<Integer> setNums =  new ArrayList<Integer>(A.length);
                for(int i: A){
                    setNums.add(i);
                }
                for(int x = 0; x < A.length;x++){
                    if(!setNums.contains(x + 1)){
                        return x + 1;
                    }
                }
                return -1;
            }
        } 
    }

    public static int Solution(int[] A){
        if (A.length > 100000){
            return -1;
        }else
        {
            A = Sort(A);
            int len = A.length;
            if(len == 1)
            {
                if(A[0] == 1)
                {
                    return 2;
                }else
                {
                    return 1;
                }
            }else if(len == 0)
            {
                return 1;
            }
            else
            {
                for(int x = 0;x < A.length;x++)
                {
                    if(A[x] != x + 1){
                        return x + 1;
                    }
                }
                return len + 1;
            }
        }
    }
    public static int[] Sort(int[] A){
        int temp;
        boolean swapped;
        for(int x = 0; x < A.length;x++){
            swapped = false;
            for(int j = x + 1; j < A.length;j++){
                if(A[x] > A[j]){
                    temp = A[x];
                    A[x] = A[j];
                    A[j] = temp;
                    swapped = true;
                }
            }
            if(swapped == false){
                break;
            }
        }
        return A;   
    }
}