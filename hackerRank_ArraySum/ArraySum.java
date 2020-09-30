package hackerRank_ArraySum;

public class ArraySum {
     /**
     * Developer - Mfundo Falteni
     * @param {int[]} ar
     * @return {int}
    */
    public static void main(String[] args){
        int[] ar = {1, 2, 3, 6, 10, 11};
        int x = arraySum(ar);
    }
    public static int arraySum(int[] ar){
        int sumCount = 0;
         int len = ar.length;
         if( len <= 0) return sumCount;
         for(int x = 0; x < len ; x++){
             sumCount += ar[x];
         } 
        return sumCount;
    }
}
