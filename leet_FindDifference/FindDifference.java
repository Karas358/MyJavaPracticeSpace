package leet_FindDifference;

public class FindDifference {
    /**
     * Developer - Mfundo Falteni
     * @param {String} s,t
     * @return {char}
    */
    public static void main(String[] args){
        /* String s = "ae";
        String t = "aea"; */
        String s = "abcd";
        String t = "abcde";
        char c = findDifference(s, t);
    }

    public static char findDifference(String s, String t){
        char[] c = t.substring(s.length(), t.length()).toCharArray();
        return c[0];
    }
}
