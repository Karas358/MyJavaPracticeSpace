package cod_Frog_Jumps;

public class JumpSecond{
    public static void main(String[] args){
        int X = 10;
        int Y = 85;
        int D = 30;
        int inteee = Solution(X, Y , D);
    }
    public static int Solution(int X, int Y, int D){
        int M = 1000000000;
        int distance = Y - X;
        if(X > M || Y > M || D > M){
            return 0;
        }
        if(X == Y || X > Y){
            return 0;
        }
        return (distance - 1) / D + 1;

        //Redo Nigga 
    }
}