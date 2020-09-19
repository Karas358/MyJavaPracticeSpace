package leet_FibonacciNumber;

public class FibonacciNumber {

    public static void main(String[] args){
        int h = fib(2);
    }

    public static int fib(int N){

        if(N > 1) return fib(N - 1) + fib(N - 2);
        return fib(N - 1) + fib(N - 2);
    }
}
