package Sort_Bubble;

public class Sort{
    
    public static void main(String[] args)
    {
        int[] A = new int[] {1,2,5,4,1};
        A = Solution(A);
    }

    public static int[] Solution(int[]A){
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