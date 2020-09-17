package leet_PalindromeNumber;

public class PalindromeNumber {

    public static void main(String[] args){
        boolean is = isPalindrome(800);
    }

    public static boolean isPalindrome(int x) {
        if(x < 0) return false;
        String number = String.valueOf(x);
        char[] c = number.toCharArray();
        int n = c.length - 1;
        for(int z = 0; z < n + 1; z++){
            if(c[z] != c[n]){ return false;}
            n--;
        }
        return true;
    }
}
