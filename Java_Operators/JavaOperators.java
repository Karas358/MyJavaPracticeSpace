package Java_Operators;

import java.util.ArrayList;
import java.util.List;

public class JavaOperators {
    public static void main(String[] args)
    {
         int a = 1;

        a ^= 2;

        System.out.println(a + "");
        //op(7);
    }
    public static void op(int x){

        if(x > 1){
            op(x/2);
        }
        System.out.println(x % 2);
    }
}