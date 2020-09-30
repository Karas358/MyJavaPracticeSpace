package hackerRank_VeryBigSum;

public class BigSum {
    public static void main(String[] args){
        long [] ar = { 1000000001, 1000000002, 1000000003, 1000000004, 1000000005};
        long x = veryBigSum(ar);
    } 

    public static long veryBigSum(long[] ar){
         long sumCount = 0;
         int len = ar.length;
         if( len <= 0) return sumCount;
         for(int x = 0; x < len ; x++){
             sumCount += (long)ar[x];
         } 
        return sumCount;
    }
}
