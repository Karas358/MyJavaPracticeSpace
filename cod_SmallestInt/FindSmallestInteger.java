package cod_SmallestInt;

import java.util.List;
import java.util.stream.IntStream; 
import java.util.stream.Collectors; 

public class FindSmallestInteger{
    public static void main(String[] args)
    {
        int[] A = new int[] {3,2,5,1};
        int Az = Solution(A);
    }
    public static int Solution(int[]A){
        if(A.length > 100000){
            return 0;
        }else{
            A = Sort(A);
            A = CleanArr(A);
            for(int x = 0;x < A.length;x++){
                if(A[x] != (x + 1)){
                    return x + 1;
                }
            }
        }
        return 0;
    }
    public static int[] CleanArr(int[] A){

        for(int x = 0; x < A.length;x++){
            for(int j = x + 1; j < A.length;j++){
                if(A[x] == A[j]){
                    List<Integer> arrList = IntStream.of(A).boxed().collect(Collectors.toList());
                    arrList.remove(j);
                    A = arrList.stream().mapToInt(Integer::intValue).toArray();
                }
            }
        }
        return A;
    }
    public static int[] Sort(int[] A){
        int temp;
        for(int x = 0; x < A.length;x++){
            for(int j = x + 1; j < A.length;j++){
                if(A[x] > A[j]){
                    temp = A[x];
                    A[x] = A[j];
                    A[j] = temp;
                }
            }
        }
        return A;   
    }
}