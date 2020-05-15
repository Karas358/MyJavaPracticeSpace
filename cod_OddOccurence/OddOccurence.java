package cod_OddOccurence;
import java.util.HashMap;

public class OddOccurence{
    public static void main(String[] args)
    {
        int[] arrCount = new int[]{9,3,9,3,9,7,9};
        int unpaired = solutionGiniella(arrCount);
    }
    public static int solutionGiniella(int[] A){
        int elemotoR = 0;

        for(int x = 0; x < A.length ; x++){
            elemotoR ^= A[x];
        }
        return elemotoR;
    }
    public static int solution(int[] A) {
        HashMap <Integer, Integer> occurrencesMap = new HashMap<Integer, Integer>();
       
        for(int i=0; i<A.length; i++) {
          if(occurrencesMap.containsKey(A[i])) {
            int occurrences = occurrencesMap.get(A[i]);
            occurrences++;
            occurrencesMap.put(A[i], occurrences); 
          }
          else {
            occurrencesMap.put(A[i], 1); 
          }
        }
        for(int currentKey : occurrencesMap.keySet()) {
          int occurrences = occurrencesMap.get(currentKey);
          //if occurs odd number of times, we found the unpaired value - no need to continue checking
          if(occurrences % 2 != 0) return currentKey;
        }
        return -1;
      }
    
     public static int Solution1(int[] A){
        int re = 0;
        if(A.length > 10000000){
            return 0;
        }else{
            A = Sort(A);
            for(int x = 0; x < A.length - 1; x+=2){
                if(A[x] != A[x + 1]){
                    re = A[x];
                    return re;
                }
            }
        }
        return A[A.length - 1];
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
