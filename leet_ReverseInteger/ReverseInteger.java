package leet_ReverseInteger;

import java.util.List;
import java.util.ArrayList;

public class ReverseInteger {

    public static void main(String[] args){
        reverse(1534236469);
    }

    public static int reverse(int x){
        
        if(validateNumber(x)){
            boolean isNegative = false;
            String Jayz = String.valueOf(x);
            if(x < 0){
                Jayz = Jayz.substring(1, Jayz.length());
                isNegative = true;
            }
            
            char[] chars = Jayz.toCharArray();
            List<String> listChars = new ArrayList<>();
            for (int z = chars.length; 0 < z  ;z--) {
                listChars.add(String.valueOf(chars[z - 1]));
            }
            String last = "";
            for (String string : listChars) {
                last += string;
            }
            try{
                int res = Integer.parseInt(last);
                if(isNegative) res = -(res);
                return res;
            }
            catch(Exception e){
                return 0;
            }
           
        }
        return 0;
    }

    public static boolean validateNumber(int x){
        return ((-2147483648) < x && x < (2147483647));   
    }
    
}
