package leet_ValidPalindrome;

public class ValidPalindrome{
    /**
     * Developer - Mfundo Falteni
     * @param {string} s
     * @return {boolean}
    */
    public static void main(String[] args) {
        /* String s = "A man, a plan, a canal: Panama";
        String s = "aa";
        String s = "";
        String s = ".,";*/
        String s = "race a car";
        boolean check = isPalindrome(s);
    }
    public static boolean isPalindrome(String s){
        
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z0-9]","");
        if(s.length() == 1 || s == null || s.length() == 0)  return true;
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while(left < right){
            if(Character.toLowerCase(chars[left]) != Character.toLowerCase(chars[right])) return false;
            left++;
            right--;
        }
        return true;
    }




    /* public static boolean isPalindrome(String s){
        if(s == null) return false;
        String regex = ":*,*\s*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        s = matcher.replaceAll("");
        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while(left != right){
            if(Character.toLowerCase(chars[left]) != Character.toLowerCase(chars[right])) return false;
            left++;
            right--;
        }
        return true;
    } */
}