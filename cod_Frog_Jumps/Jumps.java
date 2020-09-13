package cod_Frog_Jumps;
public class Jumps{
    public static void main(String[] args){
        int X = 10;
        int Y = 85;
        int D = 30;
        int inteee = 0;
        inteee = Solution(X, Y , D);
    }
    public static int Solution(int X, int Y, int D){
        int M = 1000000000;
        int N = 0;
        int count = 0;
        if(X > M || Y > M || D > M || X > Y || X == Y){
            return 0;
        }
        
        while(Y > N){

            count++;
            N = X + (D * count);
        }
        return count;
    }
}