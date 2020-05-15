package cod_CutString;

import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

public class CutString {

    public static void main(String[] args)
    {
        String message1 = "Codility we test coders"; 
        message1 = solution(message1, 14);
    }

    public static String solution(String message, int K) {
        //String messgaeString = message.replace(' ', '_');
        
        List<Integer> a = new ArrayList<Integer>();
        // write your code in Java SE 8
        for(int x = 0; x < message.length();x++)
        {
            Character c = message.charAt(x);
            if(Character.isWhitespace(c))
            {
               a.add(x);
            }
        }
        int[] Arr = new int[a.size()];
        for (int i =0; i < a.size(); i++) {
            Arr[i] = a.get(i); 
        }
        
        int j = getCut(Arr, K);

        message = message.substring(0, j);
        
        return message;
    }
    public static int getCut(int[] Ar, int K) {

        int first = 0;
        int last = Ar.length - 1;
        while (first < last) {
            int median = (first + last) / 2;
            assert(median < last);
            int d1 = Math.abs(Ar[median  ] - K);
            int d2 = Math.abs(Ar[median + 1] - K);
            if (d2 <= d1)
                first = median + 1;
            else
                last = median;
        }
        return Ar[last];
    }
}
