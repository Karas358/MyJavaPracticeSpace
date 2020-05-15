package cod_ShiftArray;

public class Shifter{
    public static void main(String[] args)
    {
        int[] A = {4,5,8,2};
        int K = 3;
        A = Solution(A,K);
    }
    public static int[] Solution(int[] A, int K){
         int len = A.length;
         //First iterate through array K times 
         for (int x = 0; x < K;x++)
         {
             //Create temp value to shift the last item first always
             int temp = A[len - 1];
             int i;
             //Iterate through array from the end 
             for(i = A.length - 1;i > 0;i--){
                    A[i] = A[i - 1];
             }
             A[i] = temp;
         }
        return A;
    }
}